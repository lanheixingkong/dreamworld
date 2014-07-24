package com.dream.weixin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.dream.weixin.common.Business;
import com.dream.weixin.message.resp.Article;
import com.dream.weixin.message.resp.NewsMessage;
import com.dream.weixin.message.resp.TextMessage;
import com.dream.weixin.util.MessageUtil;
import com.dream.weixin.util.WeixinUtil;


/**
 * 核心服务类
 * 
 * @author wenmx
 * @date 
 */
@Service
public class CoreService {
	private static final Logger logger = Logger.getLogger(CoreService.class);
	/**
	 * 处理微信发来的请求
	 * 
	 * @param request
	 * @return
	 */
	public static String processRequest(HttpServletRequest request) {
		String respMessage = null;
		try {
			// 默认返回的文本消息内容
			String respContent = "请求处理异常，请稍候尝试！";
			long now = new Date().getTime();
			// xml请求解析
			Map<String, String> requestMap = MessageUtil.parseXml(request);

			// 发送方帐号（open_id）
			String fromUserName = requestMap.get("FromUserName");
			// 公众帐号
			String toUserName = requestMap.get("ToUserName");
			// 消息类型
			String msgType = requestMap.get("MsgType");
			
			// 文本消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
				respContent = "text content";
				String content = requestMap.get("Content");
				
//				String contentMeg = WeixinUtil.getPropsValue("content_meg");
				
//				if(contentMeg.equals(content)){
//					NewsMessage newsMessage = new NewsMessage();
//					
//					newsMessage.setArticleCount(1);
//					newsMessage.setToUserName(fromUserName);
//					newsMessage.setFromUserName(toUserName);
//					newsMessage.setCreateTime(now);
//					newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
//					newsMessage.setFuncFlag(0);
//					Article article1 = new Article();
//					article1.setPicUrl(Business.BASEURL+Business.SERVLETURL+Business.RESOURCESURL+"/images/register_home.jpg");
//					article1.setTitle("疯狂抢购");
//					article1.setDescription("疯狂抢购");
//					article1.setUrl("http://120.204.81.196/query2.php");
//
//					List<Article> articles = new ArrayList<Article>();
//					articles.add(article1);
//					newsMessage.setArticles(articles);
//					respMessage = MessageUtil.newsMessageToXml(newsMessage);
//				}
				if("I Love U".equals(content)){
					respContent = "I Love U Too";
				}else{
					respContent = "Hello World！";
				}
				TextMessage textMessage = new TextMessage();
				textMessage.setCreateTime(now);
				textMessage.setFromUserName(toUserName);
				textMessage.setToUserName(fromUserName);
				textMessage.setFuncFlag(0);
				textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
				textMessage.setContent(respContent);
				respMessage = MessageUtil.textMessageToXml(textMessage);
				logger.info("Text RespMessage: " + respMessage);
			}
			// 图片消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
				respContent = "您发送的是图片消息！";
			}
			// 地理位置消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
				respContent = "您发送的是地理位置消息！";
			}
			// 链接消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
				respContent = "您发送的是链接消息！";
			}
			// 音频消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
				respContent = "您发送的是音频消息！";
			}
			// 事件推送
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
				// 事件类型
				String eventType = requestMap.get("Event");
				// 订阅
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
					TextMessage textMessage = new TextMessage();
					textMessage.setContent("感谢您对\"梦世界\"的关注");
					textMessage.setCreateTime(now);
					textMessage.setFromUserName(toUserName);
					textMessage.setToUserName(fromUserName);
					textMessage.setFuncFlag(0);
					textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
					respMessage = MessageUtil.textMessageToXml(textMessage); 
				}
				// 取消订阅
				else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
					// TODO 取消订阅后用户再收不到公众号发送的消息，因此不需要回复消息
				}
				// 自定义菜单点击事件
				else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
					// 事件KEY值，与创建自定义菜单时指定的KEY值对应
					String eventKey = requestMap.get("EventKey");
					if (eventKey.equals("11")) {
						NewsMessage newsMessage = new NewsMessage();
						
						newsMessage.setArticleCount(1);
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(now);
						newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
						newsMessage.setFuncFlag(0);
						Article article1 = new Article();
						article1.setPicUrl(Business.BASEURL+Business.SERVLETURL+Business.RESOURCESURL+"/images/register_home.jpg");
						article1.setTitle("我要宝码");
						article1.setDescription("我要宝码");
						article1.setUrl(Business.BASEURL+Business.SERVLETURL+"/client/register_home.action?openid="+fromUserName);

						List<Article> articles = new ArrayList<Article>();
						articles.add(article1);
						newsMessage.setArticles(articles);
						respMessage = MessageUtil.newsMessageToXml(newsMessage);
					} else if (eventKey.equals("12")) {
						NewsMessage newsMessage = new NewsMessage();
						
						newsMessage.setArticleCount(1);
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(now);
						newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
						newsMessage.setFuncFlag(0);
						Article article1 = new Article();
						article1.setPicUrl(Business.BASEURL+Business.SERVLETURL+Business.RESOURCESURL+"/images/register_service.jpg");
						article1.setTitle("兑换服务");
						article1.setDescription("兑换服务");
						article1.setUrl(Business.BASEURL+Business.SERVLETURL+"/client/login_service.action?openid="+fromUserName);

						List<Article> articles = new ArrayList<Article>();
						articles.add(article1);
						newsMessage.setArticles(articles);
						respMessage = MessageUtil.newsMessageToXml(newsMessage);
						
					} else if (eventKey.equals("21")) {
						NewsMessage newsMessage = new NewsMessage();
						
						newsMessage.setArticleCount(1);
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(now);
						newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
						newsMessage.setFuncFlag(0);
						Article article1 = new Article();
						article1.setPicUrl(Business.BASEURL+Business.SERVLETURL+Business.RESOURCESURL+"/images/first.jpg");
						article1.setTitle("微信商城");
						article1.setDescription("微信商城");
						article1.setUrl("http://120.204.81.196/wechat_shop/product/klzq.html?hidden=1&openid="+fromUserName+"&t=1402021210760");

						List<Article> articles = new ArrayList<Article>();
						articles.add(article1);
						newsMessage.setArticles(articles);
						respMessage = MessageUtil.newsMessageToXml(newsMessage);
					} 
				}
			}
			
		} catch (Exception e) {
			logger.error(e.fillInStackTrace(),e);
			
		}
		
		return respMessage;
	}
}