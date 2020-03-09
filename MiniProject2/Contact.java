package MiniProject2;

import javax.xml.namespace.QName;


public class Contact {
    String name;
    String email;
    String mobileNum;
    String workNum;
    String homeNum;
    String address;
    int position;


    Contact() {

    }

    Contact(String name, String email, String mobileNum, String workNum, String homeNum, String address, int position) {
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
        this.workNum = workNum;
        this.homeNum = homeNum;
        this.address = address;
        this.position = position;


    }

    public String toString(){

        return   + getPosition() +". <"+ getName() + ">" + "( email=" + getEmail() + ", mobile=" + getMobileNum() + ", work=" + getWorkNum() + ", home=" + getHomeNum() + ", address=" + getAddress() + ")";
        }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() { return mobileNum; }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum;
    }

    public String getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPosition(){
        return position;
    }

    public void setIndex(int position){
        this.position= position;
    }


}


