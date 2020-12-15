package com.z.spring.utils;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class SqlResultToBean {

    public static<T> List<T> coverte(ResultSet resultSet,Class<T> clazz) throws Exception {

        List<T> res = new ArrayList<>();

        ResultSetMetaData metaData = resultSet.getMetaData();

        while (resultSet.next()){
            T obj = clazz.newInstance();
            for (int i = 0; i < metaData.getColumnCount(); i++) {
                String columnName = metaData.getColumnName(i + 1);
                String value = resultSet.getString(columnName);
                Method declaredMethod = clazz.getDeclaredMethod("set" + columnName.substring(0, 1).toUpperCase() + columnName.substring(1),value.getClass());
                declaredMethod.invoke(obj,value);
            }
            res.add(obj);
        }

        return res;
    }

}
