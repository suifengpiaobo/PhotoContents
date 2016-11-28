package razerdp.github.com.demo.model.entity;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import razerdp.github.com.demo.utils.StringUtil;
import razerdp.github.com.demo.utils.ToolUtil;


/**
 * Created by 大灯泡 on 2016/10/28.
 * <p>
 * 朋友圈内容
 */

public class MomentContent implements Serializable {
    //文字
    private String text;
    //图片
    private List<String> pics;
    //web
    private String webUrl;
    //webTitle
    private String webTitle;
    //web封面
    private String webImage;

    public MomentContent() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public String getWebImage() {
        return webImage;
    }

    public void setWebImage(String webImage) {
        this.webImage = webImage;
    }

    public MomentContent addText(String text) {
        this.text = text;
        return this;
    }

    public MomentContent addPicture(String pic) {
        if (pics == null) {
            pics = new ArrayList<>();
        }
        if (pics.size() < 9) {
            pics.add(pic);
        }
        return this;
    }

    public MomentContent addWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    public MomentContent addWebTitle(String webTitle) {
        this.webTitle = webTitle;
        return this;
    }

    public MomentContent addWebImage(String webImage) {
        this.webImage = webImage;
        return this;
    }

    public boolean isValided() {
        if (ToolUtil.isListEmpty(pics)) {
            if (TextUtils.isEmpty(text)) {
                if (!StringUtil.noEmpty(webUrl, webTitle)) return false;
            }
        }
        return true;

    }


}
