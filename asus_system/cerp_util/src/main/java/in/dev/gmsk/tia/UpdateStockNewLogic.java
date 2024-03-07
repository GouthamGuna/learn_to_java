package in.dev.gmsk.tia;

public class UpdateStockNewLogic {


    public static void stockUpdatingCalculation(int actualProjectsQty, int actualMinimumQty, int poReceivedQty, int poUpdatedQty) {

        int updatingMinQty;
        int updatingProjectQty = 0;

        if (actualProjectsQty >= poUpdatedQty) {

            int remainingProjectQty = actualProjectsQty - poUpdatedQty;

            System.out.println( "ln: 15 remainingProjectQty = " + remainingProjectQty );

            if (remainingProjectQty >= poReceivedQty) {

                updatingProjectQty = poReceivedQty;
                System.out.println( "ln: 20 updatingProjectQty = " + updatingProjectQty );
            } else {

                updatingProjectQty = poReceivedQty - remainingProjectQty;
                poReceivedQty = poReceivedQty - updatingProjectQty;
                System.out.println( "ln: 25 updatingProjectQty = " + updatingProjectQty );
                System.out.println( "ln: 26 poReceivedQty = " + poReceivedQty );
            }
        }

        int actualProMinQty = actualProjectsQty + actualMinimumQty;
        System.out.println( "ln: 31 actualProMinQty = " + actualProMinQty );

        if (actualProMinQty >= poUpdatedQty && poReceivedQty != 0) {
            int remainingMinmiumQty = actualProMinQty - updatingProjectQty - poUpdatedQty;

            if (remainingMinmiumQty >= poReceivedQty) {
                updatingMinQty = poReceivedQty;
                System.out.println( "ln: 38 If updatingMinQty = " + updatingMinQty );
            } else {
                updatingMinQty = poReceivedQty - remainingMinmiumQty;
                System.out.println( "ln: 41 Else updatingMinQty = " + updatingMinQty );
            }

            System.out.println( "ln: 44 remainingMinmiumQty = " + remainingMinmiumQty );
        }
    }
}
