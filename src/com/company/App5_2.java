package com.company;
import java.util.Scanner;

class  App5_2

{
	public static void main(String[] args) 
	{
		String AEC;
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		AEC = sc.next();
		switch(AEC)
		{
		case "Thailand": System.out.println("Sawadee");
		break;
		case "Malaysia": System.out.println("Salamat Datang");
		break;
	    case "Myanmar": System.out.println("Mingalar Par");
		break;
		case "Philippines": System.out.println("Kumusta");
		break;
        case "Singapore": System.out.println("Ni Hao");
		break;
		case "Cambodia": System.out.println("Sho Sa Dai");
		break;
		case "BruneiDarussalam": System.out.println("Salamat Datang");
		break;
		case "Indonesia": System.out.println("Salamat siang");
		break;
        case "Vietnam": System.out.println("Xin Chao");
		break;
		case "Laos": System.out.println("Sabaidee");
		break;
		default: System.out.println("country is not on AEC");
		}
	}
}
