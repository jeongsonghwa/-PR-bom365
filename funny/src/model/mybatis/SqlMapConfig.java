package model.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

	public class SqlMapConfig {
		private static SqlSessionFactory factory;

		static {

			try {
				String resource = "model/mybatis/config.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				factory = new SqlSessionFactoryBuilder().build(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		public static SqlSessionFactory getFactory() {
			return factory;
		}
	}

