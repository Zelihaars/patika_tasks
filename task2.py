# Başlangıç Durumu:
# [16, 21, 11, 8, 12, 22]

# Bölme Aşaması:
# Dizi ikiye bölünür:
# Sol Dizi: [16, 21, 11]
# Sağ Dizi: [8, 12, 22]

# Sol Dizi İçin Bölme:
# Sol dizi de ikiye bölünür:
# Sol Dizi: [16]
# Sağ Dizi: [21, 11]

# Sol Dizi İçin Birleştirme:
# Sol dizi, tek bir eleman olduğu için ayrılmış haliyle kalır.

# Sağ Dizi İçin Bölme:
# Sağ dizi de ikiye bölünür:
# Sol Dizi: [8]
# Sağ Dizi: [12, 22]

# Sağ Dizi İçin Birleştirme:
# Sağ dizi sıralanır:
# Sağ Dizi: [12, 22]

# Sol ve Sağ Dizilerin Birleştirilmesi:
# Sol ve sağ diziler birleştirilir ve sıralanır:
# Sol Dizi: [16]
# Sağ Dizi: [11, 21]
# Birleştirilmiş Dizi: [11, 16, 21]

# Sol ve Sağ Dizilerin Birleştirilmesi:
# Sol ve sağ diziler birleştirilir ve sıralanır:
# Sol Dizi: [8]
# Sağ Dizi: [12, 22]
# Birleştirilmiş Dizi: [8, 12, 22]

# Son Aşama:
# Sol ve sağ diziler birleştirilir:
# Sol Dizi: [11, 16, 21]
# Sağ Dizi: [8, 12, 22]
# Birleştirilmiş Dizi: [8, 11, 12, 16, 21, 22]

# Sonuç olarak, verilen dizi Merge Sort algoritması kullanılarak sıralandığında, sıralanmış dizi [8, 11, 12, 16, 21, 22] olur.

# Zaman karmaşıklığı O(n log n)