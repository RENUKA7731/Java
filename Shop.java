package org.aimnxt.proj;
import java.util.*;
public class Shop implements java.io.Serializable
{
/*Item items[]=new Item[1000];
Order orders[]=new Order[1000];*/

List<Item> items=new Vector<Item>();
List<Order> orders=new Vector<Order>();
int n,m;

/*public boolean addItem(Item i)
{
if(n<1000)
{
 items[n]=i;
 n++;
 return true;
}
else
 return false;
}*/

public boolean addItem(Item i)
{
items.add(i);
return true;
}

/*public Item viewItem(int id)
{
for(int i=0;i<n;i++)
{
Item it=items[i];
if(it.getId()==id)
 return it;
}
return null;
}*/

public Item viewItem(int id)
{
for(Item item:items)
{
Item it=item;
return it;
}
return null;
}

/*public Item[] viewItems()
{
Item ti[]=new Item[n];
for(int i=0;i<n;i++)
 ti[i]=items[i];
return ti;
}*/

public List<Item> viewItems()
{
List<Item> ti=new Vector<Item>();
ti.addAll(items);
return ti;
}


/*public boolean takeOrder(Item ite)
{
if(n<1000)
{
items[n]=ite;
n++;
return true;
}
else
 return false;
}*/

public boolean takeOrder(Item ite)
{
items.add(ite);
return true;
}

/*public boolean addOrder(Order o)
{
if(m<1000)
{
orders[m]=o;
m++;
return true;
}
else 
return false;
}*/

public boolean addOrder(Order o)
{
orders.add(o);
return true;
}

/*public Order[] viewOrders()
{
Order vo[]=new Order[m];
for(int i=0;i<m;i++)
 vo[i]=orders[i];
return vo;
}*/

public List<Order> viewOrders()
{
List<Order> vo=new Vector<Order>();
vo.addAll(orders);
return vo;
}

/*public void Updates()
{
for(int i=0;i<n;i++)
items[i].Update();
}*/
public void Updates()
{
for(Item item:items)
item.Update();
}
}

