package org.aimnxt.proj;
public class Order extends Item implements java.io.Serializable
{
public static int gid=1;
double amount;
public Order()
{
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}

public void setAmount(double amonut)
{
this.amount=amount;
}
public double getAmount()
{
return amount;
}
public double getGst()
{
return 0;
}
}
