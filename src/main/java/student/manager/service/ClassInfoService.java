package student.manager.service;

import student.manager.dao.ClassInfoDao;
import student.manager.javebean.ClassInfo;

import java.util.ArrayList;
import java.util.List;

public class ClassInfoService {
    private ClassInfoDao classInfoDao = new ClassInfoDao();

    public List<ClassInfo> queryAllClassInfo() {
        return classInfoDao.queryAllClassInfo();
    }

    public Integer addClassInfo(ClassInfo classInfo) {
         return classInfoDao.addClassInfo(classInfo);
    }
}
