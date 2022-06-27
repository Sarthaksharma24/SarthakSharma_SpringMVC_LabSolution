package com.learning.studentmanagement.service;

import java.util.List;

import com.learning.studentmanagement.model.Student;

public class StudentServiceImpl implements StudentInterface {

	// Creating object leveraging SPring
		private SessionFactory sessionFactory;
		private Session session;

		// getting the session using the factory
		@Autowired
		public StudentServiceImpl(SessionFactory sessionFactory) {
			super();
			this.sessionFactory = sessionFactory;
			try {
				this.session = sessionFactory.getCurrentSession();

			} catch (HibernateException e) {
				this.session = sessionFactory.openSession();
			}

		}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveStudent(Student StudentObj) {
		// TODO Auto-generated method stub
		
	}

}
