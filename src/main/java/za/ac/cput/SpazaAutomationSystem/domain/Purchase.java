package za.ac.cput.SpazaAutomationSystem.domain;

import java.util.Date;

public class Purchase
{
    private int invoice_ID;
    private Date purchaseDate;
    private String custName;

    private Purchase()
    {
    }

    public Purchase(int invoice_ID, Date purchaseDate, String custName)
    {
        this.invoice_ID = invoice_ID;
        this.purchaseDate = purchaseDate;
        this.custName = custName;
    }

    public int getInvoice_ID()
    {
        return invoice_ID;
    }

    public void setInvoice_ID(int invoice_ID)
    {
        this.invoice_ID = invoice_ID;
    }

    public Date getPurchaseDate()
    {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    public String getCustName()
    {
        return custName;
    }

    public void setCustName(String custName)
    {
        this.custName = custName;
    }

    @Override
    public String toString()
    {
        return "Purchase{" +
                "invoice_ID=" + invoice_ID +
                ", purchaseDate=" + purchaseDate +
                ", custName='" + custName + '\'' +
                '}';
    }
}
