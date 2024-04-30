package in.dev.gmsk.controller;

import in.dev.gmsk.model.Students;
import in.dev.gmsk.service.StudentServiceImpl;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentController {
    private static final StudentServiceImpl STUDENT_SERVICE = new StudentServiceImpl();

    public String saveStudent(Students student) {
        return STUDENT_SERVICE.saveStudentData(student);
    }

    public Stream<Students> getAllStudentsList() {
        return STUDENT_SERVICE.getAllStudentsList();
    }

    public String getStudentAvatar(int studentId) {
        return STUDENT_SERVICE.getStudentAvatar(studentId);
    }

    public void composeMultiMethodOutput() throws ExecutionException, InterruptedException {

        CompletableFuture<Stream<String>> nameListFuture = CompletableFuture.supplyAsync(STUDENT_SERVICE::getString);

        CompletableFuture<List<Integer>> feeListFuture = CompletableFuture.supplyAsync(STUDENT_SERVICE::getFeeAmount);

        CompletableFuture<List<Integer>> accountsListFuture = CompletableFuture.supplyAsync(STUDENT_SERVICE::getTransportFee);

        // Combine all futures using CompletableFuture.allOf()
        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(
                nameListFuture, feeListFuture, accountsListFuture
        );
        // Wait for all futures to complete
        combinedFuture.join();

        // Retrieve the results after all futures complete
        Stream<String> string = nameListFuture.get();
        List<Integer> feeAmount = feeListFuture.get();
        List<Integer> transportFee = accountsListFuture.get();

        System.out.println("string = " + string.toList());
        System.out.println("feeAmount = " + feeAmount);
        System.out.println("transportFee = " + transportFee);
    }
}
