package com.shengsiyuan.protobuf;


public class TestProtobuf {
    public static void main(String[] args) throws Exception{
        DataInfo.Student student = DataInfo.Student.newBuilder().setName("张三").setAge(20).setAddress("北京").build();
        byte[] byteArray = student.toByteArray();

        DataInfo.Student student1 = DataInfo.Student.parseFrom(byteArray);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());
    }
}
