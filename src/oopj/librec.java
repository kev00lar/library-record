package oopj;
public class librec {
String studentName;
String branch;
String usn;

public librec()
 
{

}
public librec(String studentName,String branch,String usn)
{
	this.studentName = studentName;
	this.branch = branch;
	this.usn = usn;
}

public void setStudentName(String studentname)
{
	this.studentName  = studentName;
}
public String getStudentName()
{
	return studentName;
}

public void setBranch(String branch)
{
	this.branch = branch;
}
public String getBranch()
{
	return branch;
}

public void setUsn(String usn)
{
	this.usn = usn;
}
public String getUsn()
{
	return usn;
}
public String toString()
{
	return "This is a student record object";
}

}
