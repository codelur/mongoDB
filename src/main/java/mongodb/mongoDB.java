package mongodb;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;

public class mongoDB {
	
	public mongoDB() {

	};
	
	public void connect() {
		String connectionString = "mongodb+srv://codelur:h2UREym8Fz1WFzyh@codelur.dasmvgk.mongodb.net/?retryWrites=true&w=majority&appName=Codelur";
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection  
                //MongoDatabase database = mongoClient.getDatabase("admin");
                 
                //System.out.println("Inserted a document with the following id: " 
                //    + result.getInsertedId().asObjectId().getValue());
            	MongoDatabase database = mongoClient.getDatabase("sample_mflix");
            	MongoCollection<Document> collection = database.getCollection("movies");
            	FindIterable<Document> documents = collection.find(eq("year",1903));

                // Iterate over the documents and print them out
            
                for (Document document : documents) {

                    System.out.println(document);
                }

                // Close the connection
                mongoClient.close();
                //database.runCommand(new Document("ping", 1));
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }

	
	
}
