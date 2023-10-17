package ajaxExample;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonPersons {

	@SuppressWarnings("unchecked")
	public String getPersons() {
		// json 문자열을 보여줌, DB에서 가져왔다 생각하면됨
		Person  person1 = new Person("손흥민", "남자", 31, "축구");
		Person  person2 = new Person("김연아", "여자", 32, "피겨스케이팅");
		Person  person3 = new Person("김연경", "여자", 37, "배구");
		
		ArrayList<Person> personsList = new ArrayList<Person>();
		personsList.add(person1);
		personsList.add(person2);
		personsList.add(person3);
		
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject = null;
		
		for(Person person : personsList) {
			jsonObject = new JSONObject();
			jsonObject.put("name", person.getName());
			jsonObject.put("gender", person.getGender());
			jsonObject.put("age", person.getAge());
			jsonObject.put("field", person.getField());
			
			jsonArray.add(jsonObject);
		} // 노란색 경고 -> 타입검사안하고 왜 집어넣냐하는 쓸데없는 간섭으로 
		// 메서드에 @SuppressWarnings("unchecked")을 사용
		
		return jsonArray.toJSONString();
	}
}