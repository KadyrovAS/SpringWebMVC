package app.services;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class PeopleService {
    private static Logger logger = Logger.getLogger(PeopleService.class.getName());
    private Map<String, People> store = new HashMap<>();
    private int count = 2;
    {
        store.put("1", new People("Andrey", 52));
        store.put("2", new People("Sergey", 54));
    }

    public PeopleService(){
        logger.info("ROOT CONTEXT INIT");
        for (Map.Entry<String, People> map: store.entrySet()){
            logger.info(map.getKey() + " " + map.getValue());
        }
    }

    public People get(String id){
        return store.get(id);
    }

    public void create(String name, int age){
        count++;
        store.put(String.valueOf(count), new People(name, age));
    }

    public static class People{
        private String name;
        private int age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
