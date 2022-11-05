
public class InvoiceFormatter {
	
	private Invoice invoice;
	 
	
	public InvoiceFormatter(Invoice aInvoice)
	   {  
	      
	      invoice = aInvoice;
	   }
	
	
	public  String format(){
		String r = "I N V O I C E\n\n" 
				+ invoice.getBilling().format() 
				+ String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price",
						"Qty", "Total");
		 for (LineItem item : invoice.getItems())
	      {  
	         r = r + item.format() + "\n";
	      }

	      r = r + String.format("\nAMOUNT DUE: $%8.2f", invoice.getAmountDue());

	      return r;
			
	}
	
	


}



