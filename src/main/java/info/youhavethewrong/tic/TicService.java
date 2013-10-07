package info.youhavethewrong.tic;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class TicService extends Service<TicConfiguration> {

	public static void main(String[] args) throws Exception {
		new TicService().run(args);
	}

	@Override
	public void initialize(Bootstrap<TicConfiguration> bootstrap) {
		bootstrap.setName("tic");
	}

	@Override
	public void run(TicConfiguration config, Environment env) throws Exception {
		env.addResource(new TicResource());
	}

}