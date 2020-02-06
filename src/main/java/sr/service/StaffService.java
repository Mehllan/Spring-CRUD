package sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import sr.model.Staff;
import sr.repository.StaffRepository;

public class StaffService implements StaffRepository{
	@Autowired
	private StaffRepository staffrepo;

	public List<Staff> findAll() {
		// TODO Auto-generated method stub
		return (List<Staff>) staffrepo.findAll();
	}

	public List<Staff> findAll(Sort sort) {
		return null; 
	}

	public List<Staff> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Staff> List<S> saveAll(Iterable<S> staff) {
		// TODO Auto-generated method stub
		return staffrepo.saveAll(staff);
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Staff> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteInBatch(Iterable<Staff> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public Staff getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Staff> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Staff> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Staff> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Staff> S save(S staff) {
		return staffrepo.save(staff);
		// TODO Auto-generated method stub
//		return staffrepo.save(staff);
	}

	public Optional<Staff> findById(Integer id) {
		// TODO Auto-generated method stub
		return staffrepo.findById(id);
	}

	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(Integer id) {
		staffrepo.deleteById(id);
	}

	public void delete(Staff entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Staff> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Staff> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Staff> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Staff> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Staff> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
