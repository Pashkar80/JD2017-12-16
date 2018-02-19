package by.it.karpeichyk.jd03_02;

import java.io.Serializable;

/**
 * Created by user on 19.02.2018.
 */
 class Role implements Serializable {
     private  int id;
     private  String role;
    public Role() {
    }
public  Role (int id, String role){
        this.id=id;
        this.role=role;
}
public  int getId(){return  id;}
public  void setId(int id){this.id=id;}
public  String getRole(){return  role;}

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
    int result= id;
    result= 31*result+ (role != null ? role.hashCode():0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o==null || getClass() != o.getClass()) return  false;
    Role role1 = (Role) o;
    if (id != role1.id) return false;
        return role != null ? role.equals(role1.role) : role1.role == null;
    }
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" +role + '\''+
                '}';
    }


}
