# How to write generic method in java.

**syntax**
  
    return_type method_name<type_parameters>(parameter_list)
    
   * The type_parameters are variables that you specify inside angle brackets (`<>`) after the method name.
   
   * These variables can be used within the method to specify the type of the parameters or variables.

## Generic methods:

   Here’s an example of a generic method:
   
    public static <T> void printValue(T value) {
        System.out.println(value);
    }
    
   In this example, `T` is a type parameter that represents any type. You can use this method with different types, like `String`, `Integer`, or `CustomObject`.
   
## Generic methods with multiple type parameters:
   
    static <T, U> void printObjectValue(T t, U u) {
        System.out.println("t = " + t + "\tU = " + u);
    }
    
   In this example, `T` and `U` are two separate type parameters that represent different types. 
   You can use this method with different types for each parameter:
   
    printObjectValue(employee, employee.getId());
    
   Remember that you can use the `type_parameters` to specify the type of the parameters or variables within the method. 
   For example:
   
    public static <T> void update(T value) {
        System.out.println(value.getClass());  // prints the class of the object
    }
   
  In this example, `T` is used to specify the type of the `value` parameter,
  and `getClass()` is called on the `value` object to get its class.