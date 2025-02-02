package com.publiccms.entities.log;
// Generated 2021-1-14 22:33:12 by Hibernate Tools 6.0.0-SNAPSHOT

import com.publiccms.common.database.CmsUpgrader;
import com.publiccms.common.generator.annotation.GeneratorColumn;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

/**
 * LogVisit generated by hbm2java
 */
@Entity
@Table(name = "log_visit")
@DynamicUpdate
public class LogVisit implements java.io.Serializable {

    /**
    *
    */
    private static final long serialVersionUID = 1L;

    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "站点", condition = true)
    private short siteId;
    @GeneratorColumn(title = "会话", condition = true)
    private String sessionId;
    @GeneratorColumn(title = "访问日期", condition = true)
    private Date visitDate;
    @GeneratorColumn(title = "访问小时", condition = true)
    private byte visitHour;
    @GeneratorColumn(title = "IP")
    private String ip;
    @GeneratorColumn(title = "UserAgent")
    private String userAgent;
    @GeneratorColumn(title = "url")
    private String url;
    @GeneratorColumn(title = "标题")
    private String title;
    @GeneratorColumn(title = "屏幕宽度")
    private Integer screenWidth;
    @GeneratorColumn(title = "屏幕高度")
    private Integer screenHeight;
    @GeneratorColumn(title = "refererUrl")
    private String refererUrl;
    @GeneratorColumn(title = "项目类型")
    private String itemType;
    @GeneratorColumn(title = "项目ID")
    private String itemId;
    @GeneratorColumn(title = "创建日期", condition = true, order = true)
    private Date createDate;

    public LogVisit() {
    }

    public LogVisit(short siteId, String sessionId, Date visitDate, byte visitHour, String ip, String url, Date createDate) {
        this.siteId = siteId;
        this.sessionId = sessionId;
        this.visitDate = visitDate;
        this.visitHour = visitHour;
        this.ip = ip;
        this.url = url;
        this.createDate = createDate;
    }
    public LogVisit(short siteId, String sessionId, Date visitDate, byte visitHour, String ip, String userAgent, String url, String title, Integer screenWidth, Integer screenHeight, String refererUrl, String itemType, String itemId, Date createDate) {
       this.siteId = siteId;
       this.sessionId = sessionId;
       this.visitDate = visitDate;
       this.visitHour = visitHour;
       this.ip = ip;
       this.userAgent = userAgent;
       this.url = url;
       this.title = title;
       this.screenWidth = screenWidth;
       this.screenHeight = screenHeight;
       this.refererUrl = refererUrl;
       this.itemType = itemType;
       this.itemId = itemId;
       this.createDate = createDate;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = CmsUpgrader.IDENTIFIER_GENERATOR)

    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public short getSiteId() {
        return this.siteId;
    }

    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    @Column(name = "session_id", nullable = false, length = 50)
    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "visit_date", nullable = false, length = 10)
    public Date getVisitDate() {
        return this.visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    @Column(name = "visit_hour", nullable = false)
    public byte getVisitHour() {
        return this.visitHour;
    }

    public void setVisitHour(byte visitHour) {
        this.visitHour = visitHour;
    }

    @Column(name = "ip", nullable = false, length = 130)
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Column(name = "user_agent", length = 255)
    public String getUserAgent() {
        return this.userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Column(name = "url", nullable = false, length = 2048)
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Column(name="title")
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="screen_width")
    public Integer getScreenWidth() {
        return this.screenWidth;
    }
    
    public void setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
    }
    
    @Column(name="screen_height")
    public Integer getScreenHeight() {
        return this.screenHeight;
    }
    
    public void setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
    }
    
    @Column(name="referer_url", length=2048)
    public String getRefererUrl() {
        return this.refererUrl;
    }

    public void setRefererUrl(String refererUrl) {
        this.refererUrl = refererUrl;
    }

    @Column(name = "item_type", length = 50)
    public String getItemType() {
        return this.itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Column(name = "item_id", length = 50)
    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
