package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import mapper.CityMapper;
import po.City;
import service.CityService;
@Service
public class CityServiceImpl implements CityService{
	@Autowired
	CityMapper citymapper;
	public List<City> getCitylist() {
		List<City> l=citymapper.getCitys();
		return l;
	}
	public List<City> getpagecitylist(int pagenum, int pagesize) {
		PageHelper.startPage(pagenum,pagesize);  
		List<City> l=citymapper.getCitys();
		return l;
	}

}
