package org.aimnxt.proj;
public class Electrical extends Item
{
String processor;
double ram;
public Electrical()
{
}
public Electrical(int id,String name,double price,double ram,String processor)
{
super(id,name,price);
this.ram=ram;
this.processor=processor;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void setProcessor(String processor)
{
this.processor=processor;
}
public void setRam(double ram)
{
this.ram=ram;
}
public double getRam()
{
return ram;
}
public String getProcessor()
{
return processor;
}
public double getGst()
{
return price*0.3;
}
}
