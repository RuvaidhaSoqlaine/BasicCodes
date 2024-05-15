package practice;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream {

        @Test
		public void streamfilter() {
			
			ArrayList<String> names= new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adam");
			names.add("Ram");
			
			//there is no life for intermediate operator if there is no terminal operator
			//terminal operation will be execute only if intermediate operator (Filter) returns true
			//We can create stream
			//how to use filter in stream API
			
			long c=names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
//			long d=Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
//			{
//				s.startsWith("A");
//				return true;
//			}).count();
//			System.out.println(d);
//					
//		}
			
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

		}
        
        @Test
        public void streamMap() {
        	
       
			
			List<String>names=Arrays.asList("Ruvaidha","Soqlaine","Women","Myname","Lubna");
			names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
			List<String>namess=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Ram");
			namess.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
			
//			//Merging two diferent lists
			
//			Stream newStream=Stream.concat(names.stream(), namess.stream());
//			newStream.sorted().forEach(s->System.out.println(s));
//			
//			//check any match is present or not
			
//			boolean flag=newStream.anymatch(s->s.equalIgnoreCase("Adam"));
//			Assert.assertTrue(flag);
			
        }
        
//        
//        @Test
//			public void streamCollect() {
//			
//			List<String>ls=Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//			.collect(Collectors.toList());
//			System.out.println(ls.get(0));
//        }

		
        




}
