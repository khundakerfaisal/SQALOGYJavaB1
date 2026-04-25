package ThirdClass;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class jsonReadWriteProgram {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath="src/main/resources/createUser.json";
        String prefixName="User-";
        int countNumber=1;
        int lastNumberCount=0;
        String autoGenerateNumber="";
//        String userName="User-2";



        JSONParser parser=new JSONParser();

        File file=new File(filePath); //Create a blank array
        if (!file.exists() || file.length()==0){
            try(FileWriter writer=new FileWriter(filePath)){
                writer.write("[]");
            }
        }


        JSONArray nameArray= (JSONArray) parser.parse(new FileReader(filePath));
        if (!nameArray.isEmpty()){
            JSONObject lastNameObject= (JSONObject) nameArray.get(nameArray.size()-1);
            String lastName=lastNameObject.get("userName").toString();
            lastNumberCount = Integer.parseInt(lastName.substring(prefixName.length()));
        }

        for (int i=1;i<=countNumber;i++){
            autoGenerateNumber=prefixName+(lastNumberCount+i);
            JSONObject nameObject=new JSONObject();
            nameObject.put("userName",autoGenerateNumber);
            nameArray.add(nameObject);

        }


        FileWriter write=new FileWriter(filePath); //Write
        write.write(nameArray.toJSONString());
        write.flush();
        write.close();


    }
}
