1.	public boolean answerPhone(boolean isMorning, boolean isMum, boolean isAsleep) 
2.	{
3.	 	if (isAsleep) 
4.	 	{
5.	 			return false;
6.	 	}
7.	 	else 
8.	 	{
9.	 		if (isMorning) 
10.	 		{
11.	 			if (isMum)
12.	 				return true;
13.	 			else 
14.	 				return false;
15.	 		}
16.	 		else
17.	 			return true;
18.	  	}
19.	 }
