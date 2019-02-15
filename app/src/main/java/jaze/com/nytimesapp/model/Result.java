package jaze.com.nytimesapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

@SerializedName("slug_name")
@Expose
private String slugName;
@SerializedName("section")
@Expose
private String section;
@SerializedName("subsection")
@Expose
private String subsection;
@SerializedName("title")
@Expose
private String title;
@SerializedName("abstract")
@Expose
private String _abstract;
@SerializedName("url")
@Expose
private String url;
@SerializedName("byline")
@Expose
private String byline;
@SerializedName("thumbnail_standard")
@Expose
private String thumbnailStandard;
@SerializedName("item_type")
@Expose
private String itemType;
@SerializedName("source")
@Expose
private String source;
@SerializedName("updated_date")
@Expose
private String updatedDate;
@SerializedName("created_date")
@Expose
private String createdDate;
@SerializedName("published_date")
@Expose
private String publishedDate;
@SerializedName("first_published_date")
@Expose
private String firstPublishedDate;
@SerializedName("material_type_facet")
@Expose
private Object materialTypeFacet;
@SerializedName("kicker")
@Expose
private Object kicker;
@SerializedName("subheadline")
@Expose
private Object subheadline;
@SerializedName("des_facet")
@Expose
private Object desFacet = null;
@SerializedName("org_facet")
@Expose
private Object orgFacet = null;
@SerializedName("per_facet")
@Expose
private Object perFacet;
@SerializedName("geo_facet")
@Expose
private Object geoFacet;
@SerializedName("related_urls")
@Expose
private List<RelatedUrl> relatedUrls = null;
@SerializedName("multimedia")
@Expose
private Object multimedia = null;

public String getSlugName() {
return slugName;
}

public void setSlugName(String slugName) {
this.slugName = slugName;
}

public String getSection() {
return section;
}

public void setSection(String section) {
this.section = section;
}

public String getSubsection() {
return subsection;
}

public void setSubsection(String subsection) {
this.subsection = subsection;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getAbstract() {
return _abstract;
}

public void setAbstract(String _abstract) {
this._abstract = _abstract;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public String getByline() {
return byline;
}

public void setByline(String byline) {
this.byline = byline;
}

public String getThumbnailStandard() {
return thumbnailStandard;
}

public void setThumbnailStandard(String thumbnailStandard) {
this.thumbnailStandard = thumbnailStandard;
}

public String getItemType() {
return itemType;
}

public void setItemType(String itemType) {
this.itemType = itemType;
}

public String getSource() {
return source;
}

public void setSource(String source) {
this.source = source;
}

public String getUpdatedDate() {
return updatedDate;
}

public void setUpdatedDate(String updatedDate) {
this.updatedDate = updatedDate;
}

public String getCreatedDate() {
return createdDate;
}

public void setCreatedDate(String createdDate) {
this.createdDate = createdDate;
}

public String getPublishedDate() {
return publishedDate;
}

public void setPublishedDate(String publishedDate) {
this.publishedDate = publishedDate;
}

public String getFirstPublishedDate() {
return firstPublishedDate;
}

public void setFirstPublishedDate(String firstPublishedDate) {
this.firstPublishedDate = firstPublishedDate;
}

public Object getMaterialTypeFacet() {
return materialTypeFacet;
}

public void setMaterialTypeFacet(Object materialTypeFacet) {
this.materialTypeFacet = materialTypeFacet;
}

public Object getKicker() {
return kicker;
}

public void setKicker(Object kicker) {
this.kicker = kicker;
}

public Object getSubheadline() {
return subheadline;
}

public void setSubheadline(Object subheadline) {
this.subheadline = subheadline;
}

public Object getDesFacet() {
return desFacet;
}

public void setDesFacet(Object desFacet) {
this.desFacet = desFacet;
}

public Object getOrgFacet() {
return orgFacet;
}

public void setOrgFacet(Object orgFacet) {
this.orgFacet = orgFacet;
}

public Object getPerFacet() {
return perFacet;
}

public void setPerFacet(Object perFacet) {
this.perFacet = perFacet;
}

public Object getGeoFacet() {
return geoFacet;
}

public void setGeoFacet(Object geoFacet) {
this.geoFacet = geoFacet;
}

public List<RelatedUrl> getRelatedUrls() {
return relatedUrls;
}

public void setRelatedUrls(List<RelatedUrl> relatedUrls) {
this.relatedUrls = relatedUrls;
}

public Object getMultimedia() {
return multimedia;
}

public void setMultimedia(Object multimedia) {
this.multimedia = multimedia;
}

}