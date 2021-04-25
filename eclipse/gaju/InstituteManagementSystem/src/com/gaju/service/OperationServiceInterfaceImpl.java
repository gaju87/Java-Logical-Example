package com.gaju.service;

import java.util.*;

import com.gaju.db.OperationInterfaceI;
import com.gaju.db.OperationInterfaceimpl;

public class OperationServiceInterfaceImpl implements OperationServiceInterfaceI {

	Scanner sc = new Scanner(System.in);
	OperationInterfaceI odb = new OperationInterfaceimpl();

	@Override
	public void addCourse() {
		odb.addCourse();

	}

	@Override
	public void viewCourse() {
		odb.viewCourse();

	}

	@Override
	public void addFaculty() {
		odb.addFaculty();

	}

	@Override
	public void viewFaculty() {
		odb.viewFaculty();

	}

	@Override
	public void addBatch() {
		odb.addBatch();

	}

	@Override
	public void viewbatch() {
		odb.viewbatch();
	}

	@Override
	public void addStudent() {
		odb.addStudent();
	}

	@Override
	public void viewStudent() {
		odb.viewStudent();
	}

}
