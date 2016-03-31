import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class MyLittleHBaseClient {
	public static void main(String[] args) {
		Configuration config = HBaseConfiguration.create();
		config.set("zookeeper.recovery.retry", "1");
		config.set("hbase.client.retries.number", "1");
		try {
			HBaseAdmin admin = new HBaseAdmin(config);
			admin.deleteTable("temp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
