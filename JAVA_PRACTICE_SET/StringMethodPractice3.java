class StringMethodPractice3
{
	public static void main(String args[])
	{
		String s="hello";
		System.out.println(s.charAt(0)); // charAt() method
		System.out.println(s.codePointAt(0)); // codePointAt() method
		System.out.println(s.codePointBefore(1)); // codePointBefore() method
		System.out.println(s.codePointCount(0,5)); // codePointCount() method
		String s1="Hello";
		System.out.println(s.compareTo(s1)); // compareTo() method
		System.out.println(s.compareToIgnoreCase(s1)); // compareToIgnoreCase() method
		System.out.println(s.concat(s1)); // concat() method
		System.out.println(s.contains("hel")); // contains() method
		System.out.println(s.contains("e")); // contains() method
		System.out.println(s.contains("hi")); // contains() method
		System.out.println(s.contentEquals(s1)); // contentEquals() method
		System.out.println(s.contentEquals("hello")); // contentEquals() method

		char[] myStr={'h','e','l','l','o'};
		String myStr1="";
		myStr1=myStr1.copyValueOf(myStr,0,5);
		System.out.println(myStr1); // copyValueOf() method
		System.out.println(s.endsWith("hello"));
		System.out.println(s.endsWith("ello"));
		System.out.println(s.endsWith("h"));
		System.out.println(s.endsWith("o")); // endsWith() method
		System.out.println(s.equals(s1));
		System.out.println(s.equals("hello")); // equals() method
		System.out.println(s.equalsIgnoreCase(s1)); // equalsIgnoreCase() method
		System.out.println(s.hashCode()); // hashCode() method
		String s2="hello everyone";
		String s3="";
		System.out.println(s2.indexOf("everyone"));
		System.out.println(s2.indexOf("r")); // indexOf() method
		System.out.println(s1.isEmpty());
		System.out.println(s3.isEmpty()); // isEmpty() method
		System.out.println(s2.lastIndexOf("e")); // lastIndexOf() method
		System.out.println(s2.length()); // length() method
		System.out.println(s.replace('l','p')); //replace() method
		System.out.println(s.startsWith("hel"));
		System.out.println(s.startsWith("o")); // startsWith() method
		System.out.println(s2.subSequence(0,7)); // subSequence() method
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(3,4)); // substring() method
		System.out.println(s.toUpperCase()); // toUpperCase() method
		System.out.println(s1.toLowerCase());// toLowerCase() method
		String s4="    hello     ";
		System.out.println(s4);
		System.out.println(s4.trim()); // trim() method
	}
}