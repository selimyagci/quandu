package com.example.quandu.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Restaurant {

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("phoneNumber")
    private String phoneNumber;
    @SerializedName("currency")
    private String currency;
    @SerializedName("locale")
    private String locale;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("location")
    private Loc location;
    @SerializedName("reviewScore")
    private String reviewScore;
    @SerializedName("tagGroups")
    private List<TagGroup> tagGroups;
    @SerializedName("images")
    private List<Ima> images;
    @SerializedName("documents")
    private List<Docum> documents;
    @SerializedName("links")
    private List<Link> links;
    @SerializedName("bookable")
    private boolean bookable;
    @SerializedName("ccvEnabled")
    private boolean ccvEnabled;
    @SerializedName("chain")
    private Cha chain;


    public Restaurant(Integer id, String name,String phoneNumber, String currency,
                      String locale, String timezone, Loc location, String reviewScore,
                      List<TagGroup> tagGroups, List<Ima> images, List<Docum> documents,
                      List<Link> links, boolean bookable,boolean ccvEnabled, Cha chain) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.currency = currency;
        this.timezone = timezone;
        this.location = location;
        this.reviewScore = reviewScore;
        this.tagGroups = tagGroups;
        this.images = images;
        this.documents = documents;
        this.links = links;
        this.bookable = bookable;
        this.ccvEnabled =ccvEnabled;
        this.chain = chain;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Loc getLocation() {
        return location;
    }

    public void setLocation(Loc location) {
        this.location = location;
    }

    public String getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(String reviewScore) {
        this.reviewScore = reviewScore;
    }

    public List<TagGroup> getTagGroups() {
        return tagGroups;
    }

    public void setTagGroups(List<TagGroup> tagGroups) {
        this.tagGroups = tagGroups;
    }

    public List<Ima> getImages() {
        return images;
    }

    public void setImages(List<Ima> images) {
        this.images = images;
    }

    public List<Docum> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Docum> documents) {
        this.documents = documents;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public boolean isBookable() {
        return bookable;
    }

    public void setBookable(boolean bookable) {
        this.bookable = bookable;
    }

    public boolean isCcvEnabled() {
        return ccvEnabled;
    }

    public void setCcvEnabled(boolean ccvEnabled) {
        this.ccvEnabled = ccvEnabled;
    }

    public Cha getChain() {
        return chain;
    }

    public void setChain(Cha chain) {
        this.chain = chain;
    }

    public class Loc{
        @SerializedName("coordinates")
        private Coordinate coordinates;
        @SerializedName("address")
        private Adr address;

        public Loc(Coordinate coordinates, Adr address){
            this.coordinates = coordinates;
            this.address = address;
        }

        public Coordinate getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Coordinate coordinates) {
            this.coordinates = coordinates;
        }

        public Adr getAddress() {
            return address;
        }

        public void setAddress(Adr address) {
            this.address = address;
        }

        public class Adr{
            @SerializedName("street")
            private String street;
            @SerializedName("number")
            private String number;
            @SerializedName("zipcode")
            private String zipcode;
            @SerializedName("city")
            private String city;
            @SerializedName("country")
            private String country;

            public Adr(String street,String number,String zipcode, String city, String country){
                this.street = street;
                this.city = city;
                this.country = country;
                this.zipcode = zipcode;
                this.number = number;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public String getZipcode() {
                return zipcode;
            }

            public void setZipcode(String zipcode) {
                this.zipcode = zipcode;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }
        }

        private class Coordinate{
            @SerializedName("latitude")
            private double latitude;
            @SerializedName("longitude")
            private double longitude;

            public Coordinate(double latitude, double longitude){
                this.latitude = latitude;
                this.longitude = longitude;
            }

            public double getLatitude() {
                return latitude;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public double getLongitude() {
                return longitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }
        }
    }

    private class TagGroup{
        @SerializedName("type")
        private String type;
        @SerializedName("tags")
        private List<Tag> tags;

        public TagGroup(String type, List<Tag> tags){
            this.type = type;
            this.tags = tags;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<Tag> getTags() {
            return tags;
        }

        public void setTags(List<Tag> tags) {
            this.tags = tags;
        }

        private class Tag{
            @SerializedName("id")
            private String id;
            @SerializedName("name")
            private String name;

            public Tag(String id, String name){
                this.id = id;
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public class Ima{
        @SerializedName("url")
        private String url;

        public Ima(String url){
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    private class Docum{
        @SerializedName("name")
        private String name;
        @SerializedName("url")
        private String url;
        @SerializedName("format")
        private String format;
        @SerializedName("description")
        private String description;

        public Docum(String name,String url, String format,String description){
            this.name = name;
            this.description = description;
            this.format = format;
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    private class Link{
       @SerializedName("href")
       private String href;
       @SerializedName("method")
       private String method;
       @SerializedName("rel")
       private String rel;

       public Link(String href, String method, String rel){
           this.href = href;
           this.method = method;
           this.rel = rel;
       }


        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getRel() {
            return rel;
        }

        public void setRel(String rel) {
            this.rel = rel;
        }
    }

    private class Cha{
        @SerializedName("id")
        private Integer id;
        @SerializedName("name")
        private String name;

        public Cha(Integer id, String name){
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
