import org.aimnxt.proj.IItem;
import org.aimnxt.proj.Item;
import org.aimnxt.proj.FoodItem;
import org.aimnxt.proj.Electrical;
import org.aimnxt.proj.Order;
import org.aimnxt.proj.Shop;
import java.io.*;
import java.util.*;
class ShopUI
{
public static void main(String ar[]) throws Exception
{
Shop s=null;
File f=new File("Myshop");
if(f.exists())
{
try
{
FileInputStream fin=new FileInputStream(f);
ObjectInputStream is=new ObjectInputStream(fin);
s=(Shop)is.readObject();
}
catch(Exception e)
{
System.out.println("Invalid values: "+e.getMessage());
}
}
else
s=new Shop();
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("----MENU-----");
System.out.println("1.Add Item");
System.out.println("2.View Item");
System.out.println("3.View All");
System.out.println("4.Take Order");
System.out.println("5.View Order");
System.out.println("6.Update");
System.out.println("7.Exit");
System.out.println("Enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("1.Food Item \n2.Electrical item \nEnter your choice");
int c=sc.nextInt();
if(c==1)
{
System.out.println("Enter id name price expirydate");
int id=sc.nextInt();
String na=sc.next();
double p=sc.nextDouble();
String exp=sc.next();
Item ii=new FoodItem();
ii.setId(id);
ii.setName(na);
ii.setPrice(p);
((FoodItem)ii).setExp(exp);
boolean b=s.addItem(ii);
if(b)
  System.out.println("success");
else
 System.out.println("failed");
}
else if(c==2)
{
System.out.println("Enter id name price ram processor");
int id=sc.nextInt();
String na=sc.next();
double p=sc.nextDouble();
double ram=sc.nextDouble();
String processor=sc.next();
Item ii=new Electrical();
ii.setId(id);
ii.setName(na);
ii.setPrice(p);
((Electrical)ii).setRam(ram);
((Electrical)ii).setProcessor(processor);
boolean b=s.addItem(ii);
if(b)
  System.out.println("success");
else
 System.out.println("failed");
}
else
 System.out.println("please enter valid choice");
break;
case 2: System.out.println("Enter id");
int iid=sc.nextInt();
Item item=s.viewItem(iid);
if(item!=null){
System.out.println(item.getName()+"  "+item.getPrice());
if(item instanceof FoodItem)
System.out.println(((FoodItem)item).getExp());
if(item instanceof Electrical)
{
System.out.println(((Electrical)item).getRam());
System.out.println(((Electrical)item).getProcessor());
}
}
else
 System.out.println("Item not found");
break;
case 3:
List<Item> allItems=s.viewItems();
for(Item allItem:allItems )
{
System.out.println(allItem.getId()+"  "+allItem.getName()+"  "+allItem.getPrice());
if(allItem instanceof FoodItem)
System.out.println(((FoodItem)allItem).getExp()); 
if(allItem instanceof Electrical)
{
System.out.println(((Electrical)allItem).getRam());
System.out.println(((Electrical)allItem).getProcessor());
}
}
break;


case 4:
double total=0;
while(true)
{
System.out.println("Enter id");
int nns=sc.nextInt();
if(nns==-1)
break;
Item ns=s.viewItem(nns);
if(ns!=null)
{
System.out.println("Quantity: ");
int quantity=sc.nextInt();
System.out.println(ns.getName()+" "+ns.getPrice()*quantity);
if(ns instanceof FoodItem)
{
System.out.println(((FoodItem)ns).getExp());
}

total=total+ns.getPrice()*quantity;
System.out.println("Total:"+total);
}
else
System.out.println("Item not found");
}
System.out.println("Total Bill is:"+total);
Order o=new Order();
o.setId(Order.gid++);
o.setAmount(total);
s.addOrder(o);
break;

case 5:
List<Order> allOrders=s.viewOrders();
for(Order allOrder:allOrders)
{
System.out.println(allOrder.getId()+" "+allOrder.getAmount());
}
break;

case 6:
 s.Updates();
break;


case 7:
FileOutputStream fout=new FileOutputStream(f);
ObjectOutputStream os=new ObjectOutputStream(fout);
os.writeObject(s);
System.exit(0);
break;
default:System.out.println("Please enter a valid choice");
}//switch
}//while
}//main
}//class