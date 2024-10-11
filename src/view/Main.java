package view;

import model.EmailSender;
import model.Invoice;
import model.InvoiceFormatter;
import model.Item;
import model.Notifier;
import model.StringInvoiceFormatter;

public class Main {
    
	public static void main(String[] args) {
        
        Invoice invoice = new Invoice("Emerson Carvalho");
        invoice.addItem(new Item("Produto A", 2, 50));
        invoice.addItem(new Item("Produto B", 3, 30));
        
        InvoiceFormatter formatter = new StringInvoiceFormatter();
        String formattedInvoice = formatter.format(invoice);
        
        Notifier notifier = new EmailSender();
        notifier.notify("emerson@mail.com", formattedInvoice);
    }

}
