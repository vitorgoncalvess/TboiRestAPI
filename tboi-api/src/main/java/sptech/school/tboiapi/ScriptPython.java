package sptech.school.tboiapi;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public abstract class ScriptPython {
    static Process mProcess;

    public static List<String> runScript(){
        List<String> text = new ArrayList<>();
        Process process;
        try{
            process = Runtime.getRuntime().exec("python C:\\Users\\Vitor\\Documents\\SPTECH\\Projetos\\TboiRestAPI\\python\\main.py");
            mProcess = process;
        }catch(Exception e) {
            System.out.println("Exception Raised" + e.toString());
        }
        InputStream stdout = mProcess.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout,StandardCharsets.UTF_8));
        String line;
        try{
            while((line = reader.readLine()) != null){
                text.add(line);
            }
        }catch(IOException e){
            System.out.println("Exception in reading output"+ e.toString());
        }
        return text;
    }

}
