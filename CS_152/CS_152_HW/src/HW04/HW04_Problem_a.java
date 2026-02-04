package HW04;

import java.io.*;
import java.util.Scanner;

class Student {
	String name;
	String address;
	String major;
	double gpa;

	public Student(String name, String address, String major, double gpa) {
		this.name = name;
		this.address = address;
		this.major = major;
		this.gpa = gpa;
	}

	public String toString() {
		return "Name: " + name + ", Address: " + address + ", Major: " + major + ", GPA: " + gpa;
	}
}

class Node {
	Student data;
	Node next;

	public Node(Student data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	private Node head;

	Student data;
	Node next;

	public void Node(Student data) {
		this.data = data;
		this.next = null;
	}

	public LinkedList() {
		this.head = null;
	}

	public void loadDataFromFile(String filename) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(filename));
		while (scanner.hasNextLine()) {

			String line = scanner.nextLine();

			String[] split = line.split(", ");
			String name = split[0];
			String address = split[1];
			String major = split[2];
			double gpa = Double.parseDouble(split[3]);

			Student student = new Student(name, address, major, gpa);
			add(student);
		}
		scanner.close();
	}

	public void add(Student student) {
		Node newNode = new Node(student);
		if (head == null) {
			head = newNode;
		
		} else {
			
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newNode;
		}
	}

	public void DeleteLastNode() {
		if (head == null) {
			return;
		}

		if (head.next == null) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next != null && temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	public void InsertBetweenFirstAndSecond(Student student) {
		if (head == null || head.next == null) {
			System.out.println("Not enough nodes to insert between.");
			return;
		}
		Node newNode = new Node(student);
		newNode.next = head.next;
		head.next = newNode;
	}

	public void DeleteNodeIndex(int index) {
		if (index <= 0) {
			System.out.println("Cannot delete the first node.");
			return;
		}

		Node temp = head;
		int count = 0;

		while (temp != null ) {
			temp = temp.next;
			count++;
		}

		if (temp == null || temp.next == null) {
			System.out.println("Cannot delete the last node.");
			return;
		}

		temp.next = temp.next.next;
	}

	public void PrintLL() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class HW04_Problem_a {

	String name;
	String address;
	String major;
	double gpa;

	public void Student(String name, String address, String major, double gpa) {
		this.name = name;
		this.address = address;
		this.major = major;
		this.gpa = gpa;
	}

	public String toString() {
		return "Name: " + name + ", Address: " + address + ", Major: " + major + ", GPA: " + gpa;
	}

	public static void main(String[] args) {
		LinkedList studentList = new LinkedList();

		try {
			studentList.loadDataFromFile("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/HW04/student.txt"); // get data from file

			System.out.println("Initial Student Records:");
			studentList.PrintLL(); // print LL

			studentList.DeleteLastNode(); // delete last node

			System.out.println();
			System.out.println("After deleting last node:");
			studentList.PrintLL();

			Student newStudent = new Student("New Student", "New Address", "New Major", 0.0);
			studentList.InsertBetweenFirstAndSecond(newStudent); // insert a newStudent between the first and second node
																	
			System.out.println();
			System.out.println("After inserting between first and second:");
			studentList.PrintLL();

			studentList.DeleteNodeIndex(1); // delete node at index 1
			System.out.println();
			System.out.println("After deleting intermediate node at index 1:");
			studentList.PrintLL();

		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}
}
