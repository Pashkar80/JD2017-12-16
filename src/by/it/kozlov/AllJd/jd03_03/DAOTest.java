package by.it.kozlov.jd03_03;

import by.it.kozlov.jd03_03.beans.*;
import by.it.kozlov.jd03_03.dao.DAO;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;


public class DAOTest {

    @Test
    public void userDAO() throws SQLException {
        DAO dao = DAO.getDAO();
        User user = dao.user.read(1);
        String test = "User{id=1, login='bayernkraft.by', email='bmw.service@bayernkraft.by', password='bayernkraft', cityID=7, address='ул. Панченко, 9', phoneNumber='+375447730077', rilesID=2}";
        Assert.assertEquals("Error read", test, user.toString());

        user.setPassword("12345678");
        dao.user.create(user);
        user = dao.user.read(user.getId());
        test = String.format("User{id=%d, login='bayernkraft.by', email='bmw.service@bayernkraft.by', password='12345678', cityID=7, address='ул. Панченко, 9', phoneNumber='+375447730077', rilesID=2}", user.getId());
        Assert.assertEquals("Error create", test, user.toString());

        user.setPassword("qwerty");
        dao.user.update(user);
        user = dao.user.read(user.getId());
        test = String.format("User{id=%d, login='bayernkraft.by', email='bmw.service@bayernkraft.by', password='qwerty', cityID=7, address='ул. Панченко, 9', phoneNumber='+375447730077', rilesID=2}", user.getId());
        Assert.assertEquals("Error update", test, user.toString());
        int id = user.getId();
        dao.user.delete(user);
        user = dao.user.read(id);
        Assert.assertNull("Error delete", user);
        Assert.assertNotNull("Error getAll", dao.user.getAll().get(0));
    }

    @Test
    public void roleDAO() throws SQLException {
        DAO dao = DAO.getDAO();
        Role role = dao.role.read(1);
        String test = "Role{id=1, role='admin'}";
        Assert.assertEquals("Error read", test, role.toString());
        role = dao.role.read("user");
        test = "Role{id=2, role='user'}";
        Assert.assertEquals("Error read name", test, role.toString());
        Assert.assertFalse("Error create", dao.role.create(role));
        Assert.assertFalse("Error update", dao.role.update(role));
        Assert.assertFalse("Error delete", dao.role.delete(role));
        Assert.assertNotNull("Error getAll", dao.role.getAll().get(0));

    }

    @Test
    public void cityDAO() throws SQLException {
        DAO dao = DAO.getDAO();
        City city = dao.city.read(1);
        String test = "City{id=1, city='Брестская область'}";
        Assert.assertEquals("Error read", test, city.toString());
        city = dao.city.read("г. Минск");
        test = "City{id=7, city='г. Минск'}";
        Assert.assertEquals("Error read name", test, city.toString());
        Assert.assertFalse("Error create", dao.city.create(city));
        Assert.assertFalse("Error update", dao.city.update(city));
        Assert.assertFalse("Error delete", dao.city.delete(city));
        Assert.assertNotNull("Error getAll", dao.city.getAll().get(0));

    }

    @Test
    public void brandDAO() throws SQLException {
        DAO dao = DAO.getDAO();
        Brand brand = dao.brand.read(1);
        String test = "Brand{id=1, brand='BMW'}";
        Assert.assertEquals("Error read", test, brand.toString());
        brand = dao.brand.read("Mercedes-Benz");
        test = "Brand{id=2, brand='Mercedes-Benz'}";
        Assert.assertEquals("Error read name", test, brand.toString());
        Assert.assertFalse("Error create", dao.brand.create(brand));
        Assert.assertFalse("Error update", dao.brand.update(brand));
        Assert.assertFalse("Error delete", dao.brand.delete(brand));
        Assert.assertNotNull("Error getAll", dao.brand.getAll().get(0));
    }

    @Test
    public void carDAO() throws SQLException, IllegalAccessException, InstantiationException {
        DAO dao = DAO.getDAO();
        Car car = (Car) dao.car.read(1);
        String test = "Car{id=1, brandID=1, model='7 series', carClass='Седан', price=164400.0, year=2018, usersID=1}";
        Assert.assertEquals("Error read", test, car.toString());

        car.setModel("X20");
        dao.car.create(car);
        car = (Car) dao.car.read(car.getId());
        test = String.format("Car{id=%d, brandID=1, model='X20', carClass='Седан', price=164400.0, year=2018, usersID=1}", car.getId());
        Assert.assertEquals("Error create", test, car.toString());

        car.setModel("X40");
        dao.car.update(car);
        car = (Car) dao.car.read(car.getId());
        test = String.format("Car{id=%d, brandID=1, model='X40', carClass='Седан', price=164400.0, year=2018, usersID=1}", car.getId());
        Assert.assertEquals("Error update", test, car.toString());
        int id = car.getId();
        dao.car.delete(car);
        car = (Car) dao.car.read(id);
        Assert.assertNull("Error delete", car);
        Assert.assertNotNull("Error getAll", dao.car.getAll("").get(0));
    }
}