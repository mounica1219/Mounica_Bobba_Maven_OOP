package com.mycompany.app;
import java.util.Arrays;
import java.util.Scanner;
interface Gift{
   public void weightCalculation();
   public void sortAccToCost();
   public void findCountWithinRange(int low,int high);
}

class Sweets
{
	int no_of_sweets;
	double single_sweet_weight;
	Sweets(int number,double weight)
	{
		single_sweet_weight=weight;
		no_of_sweets=number;
	}
	public void weightCalculation()
	{
		double total_weight;
		total_weight=no_of_sweets*single_sweet_weight;
		System.out.println("Total Weight of Sweets in child's gift:"+total_weight);
	}
}


class Chocolates implements Gift
{
	double []cost;
	double chocolates_weight;
	int no_of_chocolates;
	double []chocolate_weights;
	Chocolates(int number,double []weight,double []cost)
	{
		chocolate_weights=weight;
		no_of_chocolates=number;
		chocolates_weight=0;
		this.cost=cost;
	}
	public void weightCalculation()
	{
		double total_weight;
		for(int i=0;i<chocolate_weights.length;i++)
		{
			chocolates_weight=chocolates_weight+chocolate_weights[i];
		}
		total_weight=chocolates_weight*no_of_chocolates;
		System.out.println("Total Weight of Chocolates in child's gift:"+total_weight);
	}
	public void sortAccToCost()
	{
		Arrays.sort(cost);
		for(int i=0;i<cost.length;i++)
		{
			System.out.print(cost[i]+" ");
		}
		System.out.println("");
	}
	public void findCountWithinRange(int low,int high)
	{
		int no_of_candies_within_range=0;
		for(int i=0;i<cost.length;i++)
		{
			if(cost[i]>=low && cost[i]<=high)
			{
				no_of_candies_within_range+=1;
			}
		}
		System.out.println(no_of_candies_within_range);
	}
}

class Candies
{
	double []cost;
	double candies_weight;
	int no_of_candies;
	double[] candy_weights;
	Candies(int number,double []weight,double []cost)
	{
		no_of_candies=number;
		candy_weights=weight;
		candies_weight=0;
		this.cost=cost;
	}
	public void weightCalculation()
	{
		double total_weight;
		for(int i=0;i<candy_weights.length;i++)
		{
			candies_weight=candies_weight+candy_weights[i];
		}
		total_weight=candies_weight*no_of_candies;
		System.out.println("Total Weight of Chocolates in child's gift:"+total_weight);
	}
	public void sortAccToCost()
	{
		Arrays.sort(cost);
		for(int i=0;i<cost.length;i++)
		{
			System.out.print(cost[i]+" ");
		}
		System.out.println("");
	}
	public void findCountWithinRange(int low,int high)
	{
		int no_of_candies_within_range=0;
		for(int i=0;i<cost.length;i++)
		{
			if(cost[i]>=low && cost[i]<=high)
			{
				no_of_candies_within_range+=1;
			}
		}
		System.out.println(no_of_candies_within_range);
	}
}
public class App{
	
	private static double weights[];
	private static Scanner input= new Scanner(System.in);
	private static double costs[];
	private static double weight;

	public static void main(String[] args) {
		int num,min,max;
		
		System.out.println("\nGift Details:\n");
		
		System.out.println("Enter number of sweets:");
		num=input.nextInt();
		System.out.println("Enter weight of the sweet:");
		weight=input.nextDouble();
		Sweets sweets=new Sweets(num,weight);
		sweets.weightCalculation();

		System.out.println("\nEnter number of chocolates:");
		num=input.nextInt();
		weights = new double[num];
		costs = new double[num];
		System.out.println("\nEnter weights of "+num+" chocolates.");
		for(int i=0;i<num;i++) {
			weights[i]=input.nextDouble();
		}
		System.out.println("\nEnter costs of "+num+" chocolates.");
		for(int i=0;i<num;i++) {
			costs[i]=input.nextDouble();
		}
		Chocolates chocolates=new Chocolates(num,weights,costs);
		chocolates.weightCalculation();
		System.out.println("\nSorted order of chocolates according to cost:");
		chocolates.sortAccToCost();
		System.out.println("\nEnter minimum and maximum cost range for chocolates:");
		min=input.nextInt();
		max=input.nextInt();
		System.out.print("\nNo of Chocolates within the range: ");
		chocolates.findCountWithinRange(min,max);
		
		System.out.println("\nEnter number of Candies:");
		num=input.nextInt();
		weights = new double[num];
		costs = new double[num];
		System.out.println("\nEnter weights of "+num+" candies.");
		for(int i=0;i<num;i++) {
			weights[i]=input.nextDouble();
		}
		System.out.println("\nEnter costs of "+num+" candies.");
		for(int i=0;i<num;i++) {
			costs[i]=input.nextDouble();
		}
		Candies candies=new Candies(num,weights,costs);
		candies.weightCalculation();
		System.out.println("\nSorted order of candies according to cost:");
		candies.sortAccToCost();
		System.out.println("\nEnter minimum and maximum cost range for candies:");
		min=input.nextInt();
		max=input.nextInt();
		System.out.print("\nNo of Candies within the range: ");
		candies.findCountWithinRange(min,max);
	}
}