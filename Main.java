
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = new MongoClient();
		MongoDatabase db = mongoClient.getDatabase("test");
		
		//Member.insertOne(db);
		//Member.showAllMembers(db);
		//Member.findMembersByName(db, "Del mare");
		
		Gson gson = new Gson();
		Mem elTorro = new Mem("El Torro", "2 Av. del la maide", "New Jersey");
		String elTorro_json = gson.toJson(elTorro);
		System.out.println(elTorro_json);
		Document elTorro_doc = Document.parse(elTorro_json);
		//db.getCollection("members").insertOne(elTorro_doc);
		
		mongoClient.close();
	}

}
