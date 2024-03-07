# tiA stock updating calculation

     | itemId |  poQty   | receivedQty | receivedQty | poUpdatedQty |
     |:-------|:--------:|------------:|------------:|-------------:|
     | 934    | 30       | 10          | 20          | 10           |
     | 934    | 30       | 10          | 10          | 10           |
     | 934    | 30       | 10          | 0           |              |


     actual_poqty=30;
     actual_projectsqty=15;
     actual_extraqty=0;
     actual_minimumqty=15;

     po_updated_qty=0, 10, 20;
     po_received_qty=10, 10, 10;

     updating_projectqty=0;
     updating_minimumqty=0;
     updating_xtraqty=0;

     if actual_projectsqty >= po_updated_qty: 15 >=0, 15 >= 10, 15 >=20
     	remaining_projectqty=actual_projectsqty-po_updated_qty; 15-0, 15-10=5

     	if remaining_projectqty >= po_received_qty: 15 >= 10, 5 >=10
     		updating_projectqty=po_received_qty; 10
     		po_received_qty=0;
     	else:
     		updating_projectqty=po_received_qty-remaining_projectqty; 5
     		po_received_qty=po_received_qty-updating_projectqty; 5

     if po_received_qty !=0:
     	remaining_minmiumqty=actual_projectsqty+actual_minimumqty-po_updated_qty; 15+15-20=10
		
# Testing 

 test case : 1 

	int actualProjectsQty = 30, int actualMinimumQty = 15, int poReceivedQty = 10, int poUpdatedQty = 0
	
	result : remainingProjectQty = 30 : and updatingProjectQty = 10 and remainingMinmiumQty = 45
	
 test case : 2

	int actualProjectsQty = 30, int actualMinimumQty = 15, int poReceivedQty = 10, int poUpdatedQty = 10
	
	result : remainingProjectQty = 20 : and updatingProjectQty = 10 and remainingMinmiumQty = 35
		
 test case : 3

	int actualProjectsQty = 30, int actualMinimumQty = 15, int poReceivedQty = 10, int poUpdatedQty = 20
	
	result : remainingProjectQty = 10 : and updatingProjectQty = 10 and remainingMinmiumQty = 25