import java.io.BufferedReader; 


import java.io.InputStreamReader; 
import java.io.IOException; 


public class BukvaCount

{
	
public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("¬ведите строки:");
	
	
String stroka = reader.readLine();
char[] mass_bukv = new char[stroka.length()];
int[] mass_bukv_count = new int[stroka.length()];

for (int r = 0; r < mass_bukv_count.length; r++)
mass_bukv_count[r] = 0;

boolean f = false;
	
for (int i = 0; i < stroka.length(); i++)	
	
{

for (int j = 0; j < mass_bukv.length; j++)
{
if (mass_bukv[j] == stroka.charAt(i))
{
mass_bukv_count[j]++;
f = true;
}
}

if (f == false)
{
mass_bukv[i] = stroka.charAt(i);
mass_bukv_count[i]++;
}
f = false;
}
for (int w = 0; w < mass_bukv.length; w++)
{
if (mass_bukv_count[w] != 0 && mass_bukv[w] != ' ')
System.out.println(mass_bukv[w] + " - " + mass_bukv_count[w]);	
}
}

}