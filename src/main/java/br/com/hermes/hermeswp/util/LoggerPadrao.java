package br.com.hermes.hermeswp.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerPadrao {
	
	private static Logger logErro = LoggerFactory.getLogger("erros");
	private static Logger logInfo = LoggerFactory.getLogger("informacao");
	private static Logger logInfoStartApplication = LoggerFactory.getLogger("start_application");
	private static Logger logDebug = LoggerFactory.getLogger("depuracao");
	private static Logger logTransacao = LoggerFactory.getLogger("transacao");

	public static void info(String mensagem, Object ... args){
		logInfo.info(mensagem, args);
	}
	
	public static void info(String mensagem){
		logInfo.info(mensagem);
	}
	
	public static void transacao(String mensagem){
		logTransacao.info("loggerTransacao - "+mensagem);
	}
	
	public static void debug(String mensagem, Object ... args){
		logDebug.debug(mensagem, args);
	}
	
	public static void debug(String mensagem, long time){
		logDebug.debug(mensagem+ " - "+(System.currentTimeMillis()-time)+" ms");
	}
	

	public static void error(String mensagem, Exception e) {
		logErro.error(mensagem, e);
	}

	public static void error(String string) {
		logErro.error(string);
	}
	
	public static void info(String mensagem, long time, Object ... args){
		logInfo.info(mensagem+" - "+(System.currentTimeMillis()-time)+" ms", args);
	}
	
	public static void info(String mensagem, long time){
		logInfo.info(mensagem+ " - "+(System.currentTimeMillis()-time)+" ms");
	}
	
	public static void transacao(String mensagem, long time){
		logTransacao.info("loggerTransacao - "+mensagem+" - "+(System.currentTimeMillis()-time)+" ms");
	}
	
	public static void debug(String mensagem, long time, Object ... args){
		logDebug.debug(mensagem+" - "+(System.currentTimeMillis()-time)+" ms", args);
	}

	public static void error(String mensagem, Exception e, long time) {
		logErro.error(mensagem+" - "+(System.currentTimeMillis()-time)+" ms", e);
	}

	public static void error(String string, long time) {
		logErro.error(string+" - "+(System.currentTimeMillis()-time)+" ms");
	}
	
	public static void startApplication(String mensagem, Object ... args){
		logInfoStartApplication.info(mensagem, args);
	}
}
