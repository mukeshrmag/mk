package sample.StudentDemo.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="StudentDemoModel")
public class StudentDemoModel {
	@Id
@Column(unique=true)
private int id ;
private int age ;

@Column(nullable=false)
private String course;

@Column(nullable=false)
private String name ;


@Column(unique=true)
private int password;

@Column(nullable=false)
private String result;

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
@Override
public String toString() {
	return "StudentDemoModel [id=" + id + ", age=" + age + ", course=" + course + ", name=" + name + ", password="
			+ password + ", " +  "]";
}

}
