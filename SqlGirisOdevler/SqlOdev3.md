# SQL Ödev3
####
* Q1 - Country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.
* A1 - `SELECT country FROM country WHERE country LIKE 'A%a';`
####
* Q2 - Country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.
####
* A2 - `SELECT country FROM country WHERE country LIKE '_____%n';`
####
* Q3 - Film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sıralayınız.
####
* A3 - `SELECT title FROM film WHERE title ILIKE '%t%t%t%t%';`
####
* Q4 - Film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.
####
* A4 - `SELECT * FROM film WHERE title LIKE 'C%' AND length > 90 AND rental_rate IN (2.99);`