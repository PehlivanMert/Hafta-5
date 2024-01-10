# Futbol Maçları Eşleştirme Uygulaması

Bu Java programı, futbol takımı listesini alır, eksik olan takımları "Bay" takımı ile doldurur, ardından bu takımları karıştırarak belirli bir maç programı oluşturur.

## Kullanım

1. **Takımları Tanımlama:**
    - `combinedList' listesine, maç programının oluşturulacağı takımları tanımlıyoruz.

2. **Eksik Takımları Doldurma:**
    - Eğer listenin ikiye bölümünden kalan sıfırsa, herhangi bir işlem yapmadan devam eder.
    - Eğer farklıysa, listeye "Bay" takımı ile eklenir.

3. **Takımları Karıştırma:**
    - Liste Karıştırma işlemi için `Collections.shuffle()` metodu kullanılır.

4. **Maç Programını Oluşturma:**
    - Birinci yarı maçları oluşturulur ve ekrana yazdırılır. 
    - İkinci yarı maçları oluşturulur ve ekrana yazdırılır.

