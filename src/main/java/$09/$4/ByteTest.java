package $09.$4;

import java.nio.charset.Charset;

public class ByteTest {

	public static void main(String[] args) {
		byte [] bytes = new byte[1];
		bytes[0] = -1;
		
		//1
		System.out.println(getHexa(bytes));
		
		try {
			byte [] data1 = getBytesFromString("ff");
			
			//2
			System.out.println(getHexa(data1));
			System.out.println("" + data1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//3
		System.out.println(getHexaBytes("ff"));
	}
	
	public static final String getHexa(byte b)
	{
		// System.out.println(getFile(new Throwable()));
		String result;
		result = Integer.toHexString(b);
		if (result.length() == 1)
		{
			result = "0" + result;
		}
		else if (result.length() > 2)
		{
			result = result.substring(result.length() - 2);
		}
		return result;
	}
	
	public static final String getHexa(byte[] bytes)
	{
		StringBuffer result = new StringBuffer();
		if (bytes != null)
		{
			for (int idx = 0, length = bytes.length; idx < length; idx++)
			{
				String room = Integer.toHexString(bytes[idx]);
				if (room.length() == 1)
				{
					room = "0" + room;
				}
				else if (room.length() > 2)
				{
					room = room.substring(room.length() - 2);
				}
				result.append(room);
				if (idx < length - 1)
				{
					result.append(" ");
				}
			}
		}
		return result.toString();
	}
	
	public static final byte[] getHexaBytes(String hexaString)
	{
		byte[] hexaByteArray = null;
		if (hexaString == null || hexaString.length() == 0)
		{
			return null;
		}
		else
		{
			hexaString = hexaString.replaceAll(" ", "");
			if (hexaString.length() % 2 == 1)
			{
				StringBuffer filler = new StringBuffer();
				filler.append("0");
				filler.append(hexaString);
				hexaString = filler.toString();
			}
			// byte[] hexaByteArray = new byte[(int) Math.ceil(hexaString.length() / 2)];
			hexaByteArray = new byte[hexaString.length() / 2];
			for (int i = 0; i < hexaByteArray.length; i++)
			{
				hexaByteArray[i] = (byte) Integer.parseInt(hexaString.substring(2 * i, 2 * i + 2), 16);
			}
		}
		return hexaByteArray;
	}
	

	public static byte[] getBytesFromString(String string) throws Exception
	{
		byte[] bytes = null;
		if (string != null)
		{
			bytes = string.getBytes(Charset.forName("UTF-8"));
		}
		return bytes;
	}

}
