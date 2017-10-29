package com.hui.fastdfs;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class FastDFSTest {

	@Test
	public void test() throws FileNotFoundException, IOException, MyException {
		
		//使用全局对象加载配置文件
		ClientGlobal.init("F:/coderThree/carlmarket-web/src/main/resources/conf/client.conf");
		//创建TrackerClient对象
		TrackerClient trackerClient = new TrackerClient();
		//使用TrackerClient对象得到TrackerServer对象
		TrackerServer trackerServer = trackerClient.getConnection();
		//创建StorageServer对象的一个引用
		StorageServer storageServer = null;
		//创建StorageClient对象，使用TrackerServer和StorageServer作为参数
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		//使用storageClient实现上传
		String[] file = storageClient.upload_appender_file("D:/壁纸/0595a31ea8d3fd1f22515293304e251f94ca5fd9.jpg", "jpg", null);
		
		for (String string : file) {
			System.out.println(string);
		}
		
	}

}
