// WAP to read age of employee from the command line argument and check given age is valid or not
// using user defined Exception Handling.

class userDefineExc extends Throwable{
String msg;
public  userDefineExc(String msg)
{
this.msg = msg;
}
public String getMsg()
{
return msg;
}
}