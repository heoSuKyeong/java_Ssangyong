package hpec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class dummy {
	 public static void main(String[] args) {

	        // 입력 파일과 출력 파일 경로 설정
	        String inputFilePath = "C:\\class\\code\\oracle\\팀프로젝트_학원\\file.txt";
	        String outputFilePath = "C:\\\\class\\\\code\\\\oracle\\\\팀프로젝트_학원\\output.txt";
	        
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
	            
	            Set<String> insertStatements = new HashSet<>();
	            String line;
	            
	            while ((line = reader.readLine()) != null) {
	                // INSERT 문 찾기
	                if (line.startsWith("INSERT INTO HEO.TBLTESTSCORE (TESTSCORENUM,TESTNUM,STUDENTNUM,ATTENDANCESCORE,WRITTENSCORE,PRACTICALSCORE) VALUES")) {
	                    // 중복 INSERT 문이 아닌 경우만 쓰기 실행
	                    if (insertStatements.add(line)) {
	                        writer.write(line);
	                        writer.newLine();
	                    }
	                } else {
	                    writer.write(line);
	                    writer.newLine();
	                }
	            }
	            
	            reader.close();
	            writer.close();
	            
	            System.out.println("중복 INSERT문 제거 SQL 파일 생성");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	       }

}
