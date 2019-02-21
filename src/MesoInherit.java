

public class MesoInherit extends MesoAbstract
{
	String STIDval= "";
	char[] vals= new char[4];
	int[] charVals= new int[3];
	
	public MesoInherit(MesoStation Stid)
	{
		STIDval=Stid.getStID();
		vals=STIDval.toCharArray();
	}

	@Override
	public int[] calAverage() 
	{
		
		Double avg= (vals[0]+vals[1]+vals[2]+vals[3])/4.0;
		charVals[0]= (int)Math.ceil(avg);
		charVals[1]= (int)Math.floor(avg);
		
			if(avg-Math.floor(avg)< .5)
			{
				charVals[2]= (int)Math.floor(avg);
			}
			else
			{
				charVals[2]= (int)Math.ceil(avg);
			}
		
		// TODO Auto-generated method stub
		return charVals;
	}

	@Override
	public char letterAverage() 
	{
		char val= (char)charVals[2];
		return val;
	}
	//TODO
}