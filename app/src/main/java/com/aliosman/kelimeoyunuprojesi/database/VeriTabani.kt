package com.aliosman.kelimeoyunuprojesi.database

import android.content.Context
import android.content.SharedPreferences
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase

class VeriTabani(context: Context) {

    private lateinit var database: SQLiteDatabase
    private val kelimeler = ArrayList<String>()
    private val ayipKelimeler = ArrayList<String>()
    private val  kontrol: SharedPreferences = context.getSharedPreferences("com.aliosman.kelimeoyunuprojesi" , Context.MODE_PRIVATE)
    private val kontrolAnahtari = "kontrol"

    // Sınıf başladığında işlemlere başla
    init {
        try {
            // Veri taanını tanımla
            database = context.openOrCreateDatabase("Kelimeler", Context.MODE_PRIVATE, null)
            // Tabloyu oluştur
            database.execSQL("CREATE TABLE IF NOT EXISTS kelimeler(id INTEGER PRIMARY KEY, kelime VARCHAR, ayipKelime VARCHAR)")

            //ilk elemana git ve kontrolleri yap
            if (!veriTabaniVarMi()) {
                kelimeListesiKayit()
                veriTabaniKayit()
                //Ayıp kelimeler GitHub'a ayıp olmasın diye kaldırıldı ;)
                //ayipKelimeListesiKayit()
                //ayipKelimeVeriTabaniKayit()
                saveInt()
            }

        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }

    // Kelimeleri veri tabanına ekle
    private fun veriTabaniKayit()
    {
        try {
            //Normal kelimeleri kaydet
            for (kelime in kelimeler)
            {
                val kelimeKayit = "INSERT INTO kelimeler (kelime) VALUES ('$kelime')"
                database.execSQL(kelimeKayit)
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }

    //Ayip kelime kayit
    private fun ayipKelimeVeriTabaniKayit()
    {
        try
        {
            //Ayıp kelimeleri kaydet
            for (ayipKelime in ayipKelimeler)
            {
                val ayipKelimeKayit = "INSERT INTO kelimeler (ayipKelime) VALUES ('$ayipKelime')"
                database.execSQL(ayipKelimeKayit)
            }
        } catch (e: SQLException)
        {
            e.printStackTrace()
        }
    }

    // ArrayList'e kelime ekle
    private fun kelimeListesiKayit() {
        kelimeler.add("BEBEK")
        kelimeler.add("CEVAP")
        kelimeler.add("DAVET")
        kelimeler.add("DOLAP")
        kelimeler.add("ELMAS")
        kelimeler.add("FASIL")
        kelimeler.add("HAVAN")
        kelimeler.add("KAVUN")
        kelimeler.add("MİMAR")
        kelimeler.add("NİSAN")
        kelimeler.add("ROBOT")
        kelimeler.add("TAVAN")
        kelimeler.add("YATAK")
        kelimeler.add("ZAMİR")
        kelimeler.add("AKREP")
        kelimeler.add("BALIK")
        kelimeler.add("DENİZ")
        kelimeler.add("EKMEK")
        kelimeler.add("HALAT")
        kelimeler.add("İSYAN")
        kelimeler.add("KİLİT")
        kelimeler.add("FAKİR")
        kelimeler.add("LAZER")
        kelimeler.add("MARTI")
        kelimeler.add("NİKAH")
        kelimeler.add("ORMAN")
        kelimeler.add("RAKİP")
        kelimeler.add("SALÇA")
        kelimeler.add("TAKİP")
        kelimeler.add("VAGON")
        kelimeler.add("ZAMAN")
        kelimeler.add("ANKET")
        kelimeler.add("BIÇAK")
        kelimeler.add("ÇEKİM")
        kelimeler.add("DAKİK")
        kelimeler.add("GELİN")
        kelimeler.add("FİLİZ")
        kelimeler.add("HAPİS")
        kelimeler.add("İFADE")
        kelimeler.add("JİLET")
        kelimeler.add("KALIP")
        kelimeler.add("LAZER")
        kelimeler.add("MAYIN")
        kelimeler.add("NEDEN")
        kelimeler.add("PATEN")
        kelimeler.add("KUBİT")
        kelimeler.add("ŞEKER")
        kelimeler.add("TÜRBE")
        kelimeler.add("UZMAN")
        kelimeler.add("VAKİT")
        kelimeler.add("YOLCU")
        kelimeler.add("ZEBRA")
        kelimeler.add("AKORT")
        kelimeler.add("CIVIK")
        kelimeler.add("DOLAR")
        kelimeler.add("GÜZEL")
        kelimeler.add("HAFİF")
        kelimeler.add("İSTEK")
        kelimeler.add("KABLO")
        kelimeler.add("LİMON")
        kelimeler.add("MISIR")
        kelimeler.add("NOKTA")
        kelimeler.add("PALTO")
        kelimeler.add("RADYO")
        kelimeler.add("SABUN")
        kelimeler.add("TALİP")
        kelimeler.add("BEŞİK")
        kelimeler.add("DUMAN")
        kelimeler.add("EVLAT")
        kelimeler.add("GIDIK")
        kelimeler.add("İNCİR")
        kelimeler.add("KAŞIK")
        kelimeler.add("LOKMA")
        kelimeler.add("YEŞİL")
        kelimeler.add("SİYAH")
        kelimeler.add("BAYAT")
        kelimeler.add("KAHVE")
        kelimeler.add("KULAK")
        kelimeler.add("BEYİN")
        kelimeler.add("DOKUZ")
        kelimeler.add("SURAT")
        kelimeler.add("KIYAK")
        kelimeler.add("MARUL")
        kelimeler.add("MUSKA")
        kelimeler.add("PANEL")
        kelimeler.add("DÜĞME")
        kelimeler.add("OĞLAN")
        kelimeler.add("CEZVE")
        kelimeler.add("KÖFTE")
        kelimeler.add("BİBER")
        kelimeler.add("TUĞLA")
        kelimeler.add("BULUT")
        kelimeler.add("BALIK")
        kelimeler.add("TUHAF")
        kelimeler.add("SEVGİ")
        kelimeler.add("KUŞKU")
        kelimeler.add("MASAL")
        kelimeler.add("LEĞEN")
        kelimeler.add("TUTKU")
        kelimeler.add("NAMAZ")
        kelimeler.add("ALÇAK")
        kelimeler.add("İNANÇ")
        kelimeler.add("FIRIN")
        kelimeler.add("SINAV")
        kelimeler.add("YOKUŞ")
        kelimeler.add("RAHAT")
        kelimeler.add("LAĞIM")
        kelimeler.add("KAYAK")
        kelimeler.add("KIZAK")
        kelimeler.add("ERKEK")
        kelimeler.add("KADIN")
        kelimeler.add("ARABA")
        kelimeler.add("GÖREV")
        kelimeler.add("ÖNERİ")
        kelimeler.add("PUSUK")
        kelimeler.add("SOĞAN")
        kelimeler.add("KORKU")
        kelimeler.add("EKRAN")
        kelimeler.add("KÖPEK")
        kelimeler.add("KEMER")
        kelimeler.add("İRMİK")
        kelimeler.add("TABAK")
        kelimeler.add("KAŞIK")
        kelimeler.add("ÇATAL")
        kelimeler.add("TURTA")
        kelimeler.add("ASKER")
        kelimeler.add("ŞARKI")
        kelimeler.add("ŞOFÖR")
        kelimeler.add("ÇİÇEK")
        kelimeler.add("SAHNE")
        kelimeler.add("AYRAN")
        kelimeler.add("ERZAK")
        kelimeler.add("HALİS")
        kelimeler.add("MARKA")
        kelimeler.add("MASKE")
        kelimeler.add("DAMAT")
        kelimeler.add("DURAK")
        kelimeler.add("KUKLA")
        kelimeler.add("CADDE")
        kelimeler.add("ÇARŞI")
        kelimeler.add("TURŞU")
        kelimeler.add("MAKAS")
        kelimeler.add("HASTA")
        kelimeler.add("HASAT")
        kelimeler.add("LİSTE")
        kelimeler.add("TATLI")
        kelimeler.add("SİLGİ")
        kelimeler.add("KALEM")
        kelimeler.add("KİRLİ")
        kelimeler.add("YEREL")
        kelimeler.add("YERLİ")
        kelimeler.add("YAMAÇ")
        kelimeler.add("YARIM")
        kelimeler.add("YARIK")
        kelimeler.add("POSTA")
        kelimeler.add("TULUM")
        kelimeler.add("TOHUM")
        kelimeler.add("NAKIŞ")
        kelimeler.add("NOHUT")
        kelimeler.add("PASTA")
        kelimeler.add("TÜMÖR")
        kelimeler.add("TÜTÜN")
        kelimeler.add("SISKA")
        kelimeler.add("KURAL")
        kelimeler.add("RAMPA")
        kelimeler.add("RAKUN")
        kelimeler.add("YAPAY")
        kelimeler.add("DÜĞÜN")
        kelimeler.add("ORTAK")
        kelimeler.add("HESAP")
        kelimeler.add("ÇANTA")
        kelimeler.add("ÇIRAK")
        kelimeler.add("KÖMÜR")
        kelimeler.add("MURAT")
        kelimeler.add("EKSİK")
        kelimeler.add("EŞSİZ")
        kelimeler.add("BASUR")
        kelimeler.add("BAMYA")
        kelimeler.add("BAMBU")
        kelimeler.add("HAYAT")
        kelimeler.add("NAKİL")
        kelimeler.add("İŞLEM")
        kelimeler.add("DERYA")
        kelimeler.add("İNSAN")
        kelimeler.add("KURAN")
        kelimeler.add("İNCİL")
        kelimeler.add("YAKUT")
        kelimeler.add("DURUM")
        kelimeler.add("GERGİ")
        kelimeler.add("SAHİL")
        kelimeler.add("ROKET")
        kelimeler.add("CEKET")
        kelimeler.add("KANUN")
        kelimeler.add("HAVUZ")
        kelimeler.add("TERZİ")
        kelimeler.add("METİN")
        kelimeler.add("KABAK")
        kelimeler.add("MELEK")
        kelimeler.add("SEFER")
        kelimeler.add("IRMAK")
        kelimeler.add("CEVİZ")
        kelimeler.add("BİTİŞ")
        kelimeler.add("LOKUM")
        kelimeler.add("SIRIK")
        kelimeler.add("GENEL")
        kelimeler.add("KABUL")
        kelimeler.add("VİDEO")
        kelimeler.add("HURDA")
        kelimeler.add("GELİR")
        kelimeler.add("PUDRA")
        kelimeler.add("GARAJ")
        kelimeler.add("PEMBE")
        kelimeler.add("SİCİM")
        kelimeler.add("İLMEK")
        kelimeler.add("FİZİK")
        kelimeler.add("KİMYA")
        kelimeler.add("TAVIR")
        kelimeler.add("ENLEM")
        kelimeler.add("İPTAL")
        kelimeler.add("TUZAK")
        kelimeler.add("TAŞRA")
        kelimeler.add("KÖYLÜ")
        kelimeler.add("PEDAL")
        kelimeler.add("PİLİÇ")
        kelimeler.add("DELİK")
        kelimeler.add("FİYAT")
        kelimeler.add("KAĞIT")
        kelimeler.add("BAŞAK")
        kelimeler.add("KAZAK")
        kelimeler.add("TAVLA")
        kelimeler.add("TAKIM")
        kelimeler.add("BAKIR")
        kelimeler.add("TESTİ")
        kelimeler.add("KURAK")
        kelimeler.add("PAZAR")
        kelimeler.add("BUTON")
        kelimeler.add("HİSSE")
        kelimeler.add("ÇUKUR")
        kelimeler.add("SAÇMA")
        kelimeler.add("KAPAK")
        kelimeler.add("YAVAŞ")
        kelimeler.add("BALON")
        kelimeler.add("MÜZİK")
        kelimeler.add("BAŞKA")
        kelimeler.add("BAHÇE")
        kelimeler.add("CACIK")
        kelimeler.add("CÜMLE")
        kelimeler.add("ÇÜRÜK")
        kelimeler.add("ÇİNKO")
        kelimeler.add("ÇÖZÜM")
        kelimeler.add("DİLİM")
        kelimeler.add("DİLEK")
        kelimeler.add("ENFES")
        kelimeler.add("FELEK")
        kelimeler.add("FOSİL")
        kelimeler.add("GİYİM")
        kelimeler.add("GAZOZ")
        kelimeler.add("HAMAK")
        kelimeler.add("HOŞAF")
        kelimeler.add("HAMSİ")
        kelimeler.add("KREDİ")
        kelimeler.add("JOKEY")
        kelimeler.add("KALIN")
        kelimeler.add("MELEZ")
        kelimeler.add("NİŞAN")
        kelimeler.add("NİNNİ")
        kelimeler.add("OĞLAK")
        kelimeler.add("ÖRDEK")
        kelimeler.add("PİLOT")
        kelimeler.add("SAKIZ")
        kelimeler.add("SAVCI")
        kelimeler.add("ŞİFRE")
        kelimeler.add("ŞÜKÜR")
        kelimeler.add("TEKNE")
        kelimeler.add("VAKIF")
        kelimeler.add("YALAN")
        kelimeler.add("ZEHİR")
        kelimeler.add("ZIBIN")
        kelimeler.add("VİŞNE")
        kelimeler.add("TEPSİ")
        kelimeler.add("ŞURUP")
        kelimeler.add("ŞAFAK")
        kelimeler.add("SAVAŞ")
        kelimeler.add("POŞET")
        kelimeler.add("ÖNLÜK")
        kelimeler.add("OMLET")
        kelimeler.add("NEZLE")
        kelimeler.add("NABIZ")
        kelimeler.add("MİRAS")
        kelimeler.add("MERAK")
        kelimeler.add("METRE")
        kelimeler.add("LİDER")
        kelimeler.add("LAVAŞ")
        kelimeler.add("LEVHA")
        kelimeler.add("KAYIK")
        kelimeler.add("KORSE")
        kelimeler.add("KORNA")
        kelimeler.add("JAPON")
        kelimeler.add("ISSIZ")
        kelimeler.add("IRGAT")
        kelimeler.add("İLHAM")
        kelimeler.add("HOROZ")
        kelimeler.add("HARAM")
        kelimeler.add("HAFTA")
        kelimeler.add("GÜNEŞ")
        kelimeler.add("GÜREŞ")
        kelimeler.add("GÜMÜŞ")
        kelimeler.add("FIKRA")
        kelimeler.add("FULAR")
        kelimeler.add("ENDER")
        kelimeler.add("ENDAM")
        kelimeler.add("EŞARP")
        kelimeler.add("DAYAK")
        kelimeler.add("DİREK")
        kelimeler.add("BACAK")
        kelimeler.add("ÇUBUK")
        kelimeler.add("ÇAMUR")
        kelimeler.add("ÇUVAL")
        kelimeler.add("ÇOCUK")
        kelimeler.add("BAHAR")
        kelimeler.add("BAKIM")
        kelimeler.add("ABİDE")
        kelimeler.add("ACELE")
        kelimeler.add("TUVAL")
        kelimeler.add("YAZAR")
        kelimeler.add("YAŞAM")
        kelimeler.add("ÇINAR")
        kelimeler.add("MEYVE")
        kelimeler.add("HUKUK")
        kelimeler.add("ALBÜM")
        kelimeler.add("CİVAR")
        kelimeler.add("SAKSI")
        kelimeler.add("HAMUR")
        kelimeler.add("BAKLA")
        kelimeler.add("SARMA")
        kelimeler.add("KANAT")
        kelimeler.add("BATAK")
        kelimeler.add("VEZİR")
        kelimeler.add("DESTE")
        kelimeler.add("GÜNEY")
        kelimeler.add("KUZEY")
        kelimeler.add("TEMİZ")
        kelimeler.add("KİRAZ")
        kelimeler.add("ÇİLEK")
        kelimeler.add("ÇAKIL")
        kelimeler.add("ÇAKIR")
        kelimeler.add("ÇADIR")
        kelimeler.add("KARIŞ")
        kelimeler.add("SEKİZ")
        kelimeler.add("TARAK")
        kelimeler.add("BONUS")
        kelimeler.add("BOMBA")
        kelimeler.add("VİRÜS")
        kelimeler.add("BASEN")
        kelimeler.add("KIRIK")
        kelimeler.add("NASIL")
        kelimeler.add("NİYET")
        kelimeler.add("YÜREK")
        kelimeler.add("KARGO")
        kelimeler.add("HOKEY")
        kelimeler.add("AKRAN")
        kelimeler.add("SEBEP")
        kelimeler.add("HIRKA")
        kelimeler.add("SAHTE")
        kelimeler.add("KUMRU")
        kelimeler.add("DÜRÜM")
        kelimeler.add("KİTAP")
        kelimeler.add("BURUN")
        kelimeler.add("BASIN")
        kelimeler.add("DUDAK")
        kelimeler.add("TOPAL")
        kelimeler.add("RESİM")
        kelimeler.add("KİLİM")
        kelimeler.add("İSHAL")
        kelimeler.add("KASIM")
        kelimeler.add("DUDAK")
        kelimeler.add("TOPUK")
        kelimeler.add("MANDA")
        kelimeler.add("KUTUP")
        kelimeler.add("ŞEKİL")
        kelimeler.add("DERİN")
        kelimeler.add("SARGI")
        kelimeler.add("ÇEKİÇ")
        kelimeler.add("DUYGU")
        kelimeler.add("ASLAN")
        kelimeler.add("ESMER")
        kelimeler.add("BİLGİ")
        kelimeler.add("BİLİM")
        kelimeler.add("HIYAR")
        kelimeler.add("HELVA")
        kelimeler.add("HEYET")
        kelimeler.add("SARIK")
        kelimeler.add("ESTER")
        kelimeler.add("İSLAM")
        kelimeler.add("İKRAM")
        kelimeler.add("KELLE")
        kelimeler.add("KEYİF")
        kelimeler.add("MACUN")
        kelimeler.add("YUMAK")
        kelimeler.add("NİMET")
        kelimeler.add("GİZLİ")
        kelimeler.add("SAKLI")
        kelimeler.add("YETİM")
        kelimeler.add("PERDE")
        kelimeler.add("REŞİT")
        kelimeler.add("TARTI")
        kelimeler.add("TARIM")
        kelimeler.add("TÜFEK")
        kelimeler.add("SİLAH")
        kelimeler.add("PARTİ")
        kelimeler.add("ÇAĞRI")
        kelimeler.add("OPERA")
        kelimeler.add("KEMAN")
        kelimeler.add("UMUMİ")
        kelimeler.add("TABLO")
        kelimeler.add("DUVAR")
        kelimeler.add("TATİL")
        kelimeler.add("KİBAR")
        kelimeler.add("SAĞIR")
        kelimeler.add("SABIR")
        kelimeler.add("KABUK")
        kelimeler.add("BAYIR")
        kelimeler.add("PALET")
        kelimeler.add("KASET")
        kelimeler.add("KAPUT")
        kelimeler.add("POLİS")
        kelimeler.add("BEKÇİ")
        kelimeler.add("TÜRKÜ")
        kelimeler.add("SEÇİM")
        kelimeler.add("BULGU")
        kelimeler.add("TEKER")
        kelimeler.add("KATIR")
        kelimeler.add("TOPUZ")
        kelimeler.add("TEĞET")
        kelimeler.add("PANDA")
        kelimeler.add("KETEN")
        kelimeler.add("BANYO")
        kelimeler.add("BARIŞ")
        kelimeler.add("TAŞIT")
        kelimeler.add("FİDAN")
        kelimeler.add("ZİYAN")
        kelimeler.add("DİVAN")
        kelimeler.add("TALAŞ")
        kelimeler.add("SANAL")
        kelimeler.add("SAKAL")
        kelimeler.add("ÇAKAL")
        kelimeler.add("TAMİR")
        kelimeler.add("TORBA")
        kelimeler.add("DEYİM")
        kelimeler.add("YUNUS")
        kelimeler.add("BÖLÜM")
        kelimeler.add("BÖLÜK")
        kelimeler.add("ÜZGÜN")
        kelimeler.add("RULET")
        kelimeler.add("RAKAM")
        kelimeler.add("NESİL")
        kelimeler.add("SERÇE")
        kelimeler.add("SERİN")
        kelimeler.add("KIYMA")
        kelimeler.add("LİMAN")
        kelimeler.add("NADAS")
        kelimeler.add("ALKIŞ")
        kelimeler.add("MEZAR")
        kelimeler.add("MERMİ")
        kelimeler.add("PROJE")
        kelimeler.add("ÜÇGEN")
        kelimeler.add("MEMUR")
        kelimeler.add("SİMİT")
        kelimeler.add("YULAF")
        kelimeler.add("REÇEL")
        kelimeler.add("NÜSHA")
        kelimeler.add("MEVKİ")
        kelimeler.add("MAKAM")
        kelimeler.add("ŞUBAT")
        kelimeler.add("DEVAM")
        kelimeler.add("SOĞUK")
        kelimeler.add("YILAN")
        kelimeler.add("SİVRİ")
        kelimeler.add("YAĞMA")
        kelimeler.add("GİRİŞ")
        kelimeler.add("DAİRE")
        kelimeler.add("ŞARAP")
        kelimeler.add("TAVUK")
        kelimeler.add("KAVAK")
        kelimeler.add("HAYAL")
        kelimeler.add("ABONE")
        kelimeler.add("GİZEM")
        kelimeler.add("FALEZ")
        kelimeler.add("UYLUK")
        kelimeler.add("GİTAR")
        kelimeler.add("PRENS")
        kelimeler.add("SİNİR")
        kelimeler.add("HEKİM")
        kelimeler.add("SALON")
        kelimeler.add("KREMA")
        kelimeler.add("ÇÖKÜŞ")
        kelimeler.add("LİTRE")
        kelimeler.add("ZİHİN")
        kelimeler.add("İŞLEK")
        kelimeler.add("KURUM")
        kelimeler.add("DÖNÜM")
        kelimeler.add("DÖNEK")
        kelimeler.add("ÇÖREK")
        kelimeler.add("BELGE")
        kelimeler.add("BAKAN")
        kelimeler.add("KÖPÜK")
        kelimeler.add("SALYA")
        kelimeler.add("SEFİL")
        kelimeler.add("SİNEK")
        kelimeler.add("SİRKE")
        kelimeler.add("DÖVÜŞ")
        kelimeler.add("KOYUN")
        kelimeler.add("BEYAZ")
        kelimeler.add("LAMBA")
        kelimeler.add("BOYUN")
        kelimeler.add("KEMİK")
        kelimeler.add("MASAJ")
        kelimeler.add("MESAJ")
        kelimeler.add("İPLİK")
        kelimeler.add("İRONİ")
        kelimeler.add("DEMİR")
        kelimeler.add("TUĞLA")
        kelimeler.add("BETON")
        kelimeler.add("ÇELİK")
        kelimeler.add("ÇİMEN")
        kelimeler.add("BÖCEK")
        kelimeler.add("ÇEVRE")
        kelimeler.add("DÜZEN")
        kelimeler.add("ALTIN")
        kelimeler.add("DÖVİZ")
        kelimeler.add("YAYIN")
        kelimeler.add("CANLI")
        kelimeler.add("ANLIK")
        kelimeler.add("ŞİMDİ")
        kelimeler.add("SONUÇ")
        kelimeler.add("PINAR")
        kelimeler.add("KÜREK")
        kelimeler.add("AHŞAP")
        kelimeler.add("TAHTA")
        kelimeler.add("METAL")
        kelimeler.add("IŞIMA")
        kelimeler.add("ZARAR")
        kelimeler.add("BOYUT")
        kelimeler.add("BÜYÜK")
        kelimeler.add("PARÇA")
        kelimeler.add("SAYFA")
        kelimeler.add("ARGON")
        kelimeler.add("SOYUT")
        kelimeler.add("SOMUT")
        kelimeler.add("SOMON")
        kelimeler.add("HÜCRE")
        kelimeler.add("SIRMA")
        kelimeler.add("YANAK")
        kelimeler.add("ENKAZ")
        kelimeler.add("DOSYA")
        kelimeler.add("KAYIT")
        kelimeler.add("BUKET")
        kelimeler.add("YALIN")
        kelimeler.add("SÜSLÜ")
        kelimeler.add("DETAY")
        kelimeler.add("YONCA")
        kelimeler.add("VİLLA")
        kelimeler.add("ARAZİ")
        kelimeler.add("TARLA")
        kelimeler.add("SENET")
        kelimeler.add("ENZİM")
        kelimeler.add("DÖNEM")
        kelimeler.add("PARKE")
        kelimeler.add("KAİDE")
        kelimeler.add("ATLAS")
        kelimeler.add("ORGAN")
        kelimeler.add("DİKEN")
        kelimeler.add("ASTIM")
        kelimeler.add("YUTAK")
        kelimeler.add("SOLUK")
        kelimeler.add("NEFES")
        kelimeler.add("AKSAN")
        kelimeler.add("DOLMA")
        kelimeler.add("TONİK")
        kelimeler.add("RİMEL")
        kelimeler.add("MANAV")
        kelimeler.add("RAKIM")
        kelimeler.add("LEHÇE")
        kelimeler.add("SUCUK")
        kelimeler.add("SOSİS")
        kelimeler.add("RUTİN")
        kelimeler.add("MOTOR")
        kelimeler.add("YAKIT")
        kelimeler.add("MAZOT")
        kelimeler.add("SEZGİ")
        kelimeler.add("KOLEJ")
        kelimeler.add("DESEN")
        kelimeler.add("ŞAHİN")
        kelimeler.add("AMPUL")
        kelimeler.add("FENER")
        kelimeler.add("NASIR")
        kelimeler.add("HASIR")
        kelimeler.add("TABUT")
        kelimeler.add("YAKIN")
        kelimeler.add("YANKI")
        kelimeler.add("NEHİR")
        kelimeler.add("DERBİ")
        kelimeler.add("PİZZA")
        kelimeler.add("LATTE")
        kelimeler.add("ARENA")
        kelimeler.add("BÖLGE")
        kelimeler.add("RESMİ")
        kelimeler.add("FİKİR")
        kelimeler.add("ZİKİR")
        kelimeler.add("ÇEVİK")
        kelimeler.add("ÇIKIŞ")
        kelimeler.add("KİTLE")
        kelimeler.add("KÜTLE")
        kelimeler.add("TIRAŞ")
        kelimeler.add("KABUS")
        kelimeler.add("KASIK")
        kelimeler.add("KAÇIK")
        kelimeler.add("KAZIK")
        kelimeler.add("KAVUK")
        kelimeler.add("ANİME")
        kelimeler.add("KOMŞU")
        kelimeler.add("NAKİT")
        kelimeler.add("AKTÖR")
        kelimeler.add("DAMGA")
        kelimeler.add("EVRAK")
        kelimeler.add("BANKA")
        kelimeler.add("KARGA")
        kelimeler.add("VİRAJ")
        kelimeler.add("VEKİL")
        kelimeler.add("TEKİR")
        kelimeler.add("SAHUR")
        kelimeler.add("ÇAYIR")
        kelimeler.add("PETEK")
        kelimeler.add("VAKUM")
        kelimeler.add("KÜÇÜK")
        kelimeler.add("BİLEK")
        kelimeler.add("BIYIK")
        kelimeler.add("SEHPA")
        kelimeler.add("SALAM")
        kelimeler.add("PENSE")
        kelimeler.add("SEBİL")
        kelimeler.add("HABER")
        kelimeler.add("HAVLU")
        kelimeler.add("HÜZÜN")
        kelimeler.add("HAKİM")
        kelimeler.add("FETÜS")
        kelimeler.add("PİPET")
        kelimeler.add("LEHİM")
        kelimeler.add("ÇEŞİT")
        kelimeler.add("SABAH")
        kelimeler.add("FİŞEK")
        kelimeler.add("FAHİŞ")
        kelimeler.add("GEYİK")
        kelimeler.add("SİMGE")
        kelimeler.add("KOLON")
        kelimeler.add("ANTEN")
        kelimeler.add("ÇEŞME")
        kelimeler.add("KİMSE")
        kelimeler.add("DOĞAL")
        kelimeler.add("BÜTÜN")
        kelimeler.add("TUTUM")
        kelimeler.add("ÇARIK")
        kelimeler.add("NESNE")
        kelimeler.add("SAPAN")
        kelimeler.add("ZÜMRE")
        kelimeler.add("YENGE")
        kelimeler.add("TEYZE")
        kelimeler.add("TERİM")
        kelimeler.add("ÇEREZ")
        kelimeler.add("KATİP")
        kelimeler.add("KÜRSÜ")
        kelimeler.add("RADAR")
        kelimeler.add("DAMAR")
        kelimeler.add("ÇİZİM")
        kelimeler.add("DİZİN")
        kelimeler.add("NEZİH")
        kelimeler.add("ZENCİ")
        kelimeler.add("DERGİ")
        kelimeler.add("BÖREK")
        kelimeler.add("NASİP")
        kelimeler.add("TAKAS")
        kelimeler.add("SÜTUN")
        kelimeler.add("SATIR")
        kelimeler.add("TAKSİ")
        kelimeler.add("KARNE")
        kelimeler.add("KAHİN")
        kelimeler.add("KESİN")
        kelimeler.add("ZURNA")
        kelimeler.add("DAVUL")
        kelimeler.add("VİTES")
        kelimeler.add("ÇANAK")
        kelimeler.add("RANZA")
        kelimeler.add("LODOS")
        kelimeler.add("YELEK")
        kelimeler.add("TERFİ")
        kelimeler.add("SAKAR")
        kelimeler.add("SAKAT")
        kelimeler.add("KEBAP")
        kelimeler.add("LANET")
        kelimeler.add("SUMAK")
        kelimeler.add("KEKİK")
        kelimeler.add("TARİH")
        kelimeler.add("BASKI")
        kelimeler.add("BASIM")
        kelimeler.add("ZAYIF")
        kelimeler.add("YÜZEY")
        kelimeler.add("EVREN")
        kelimeler.add("SIFIR")
        kelimeler.add("YANIT")
        kelimeler.add("SICAK")
        kelimeler.add("GÜÇLÜ")
        kelimeler.add("GENİŞ")
        kelimeler.add("BUHAR")
        kelimeler.add("KOŞUL")
        kelimeler.add("BİRİM")
        kelimeler.add("MEKAN")
        kelimeler.add("DOMUZ")
        kelimeler.add("ŞEHİR")
        kelimeler.add("KASAP")
        kelimeler.add("BOHÇA")
        kelimeler.add("MANTI")
        kelimeler.add("ÇEYİZ")
        kelimeler.add("KUŞAK")
        kelimeler.add("KARAR")
        kelimeler.add("BESİN")
        kelimeler.add("SELAM")
        kelimeler.add("SAKİN")
        kelimeler.add("KUSUR")
        kelimeler.add("SUSAM")
        kelimeler.add("FITIK")
        kelimeler.add("AKŞAM")
        kelimeler.add("BEYTİ")
        kelimeler.add("SAYGI")
        kelimeler.add("VATAN")
        kelimeler.add("MUMYA")
        kelimeler.add("HAMAM")
        kelimeler.add("BALTA")
        kelimeler.add("TANIK")
        kelimeler.add("İPUCU")
        kelimeler.add("KONUK")
        kelimeler.add("TORTU")
        kelimeler.add("TEZAT")
        kelimeler.add("TOMAR")
        kelimeler.add("GAMZE")
        kelimeler.add("MAKET")
        kelimeler.add("PAKET")
        kelimeler.add("KEFEN")
        kelimeler.add("SINIF")
        kelimeler.add("SAMAN")
        kelimeler.add("YANCI")
        kelimeler.add("KANCA")
        kelimeler.add("SİHİR")
        kelimeler.add("KAKAO")
        kelimeler.add("SANAT")
        kelimeler.add("PATİK")
        kelimeler.add("DEPAR")
        kelimeler.add("RAPOR")
        kelimeler.add("ŞAHİT")
        kelimeler.add("KAŞAR")
        kelimeler.add("RAHİP")
        kelimeler.add("ASTAR")
        kelimeler.add("KATİL")
        kelimeler.add("MUTLU")
        kelimeler.add("GALİP")
        kelimeler.add("KAMIŞ")
        kelimeler.add("KAYIŞ")
        kelimeler.add("KEŞİF")
        kelimeler.add("TESİR")
        kelimeler.add("EKLEM")
        kelimeler.add("ATLET")
        kelimeler.add("KİRİŞ")
        kelimeler.add("TİLKİ")
        kelimeler.add("BİTKİ")
        kelimeler.add("ŞERİT")
        kelimeler.add("YEMEK")
        kelimeler.add("TEMEL")
        kelimeler.add("YAMUK")
        kelimeler.add("REVİR")
        kelimeler.add("DEVRE")
        kelimeler.add("SAÇAK")
        kelimeler.add("KAÇAK")
        kelimeler.add("TETİK")
        kelimeler.add("ÇEPER")
        kelimeler.add("YÜZÜK")
        kelimeler.add("KIZIL")
        kelimeler.add("SECDE")
        kelimeler.add("SADIK")
        kelimeler.add("KADEH")
        kelimeler.add("KAFES")
        kelimeler.add("KÖPRÜ")
        kelimeler.add("ŞEHİT")
        kelimeler.add("DAMLA")
        kelimeler.add("ŞAPKA")
        kelimeler.add("HALKA")
        kelimeler.add("HAZIR")
        kelimeler.add("TOKAT")
        kelimeler.add("KABAN")
        kelimeler.add("VAHŞİ")
        kelimeler.add("POLAR")
        kelimeler.add("MİKRO")
        kelimeler.add("MAKRO")
        kelimeler.add("İFTAR")
        kelimeler.add("HİSAR")
        kelimeler.add("YAŞLI")
        kelimeler.add("KUMAR")
        kelimeler.add("SAYIM")
        kelimeler.add("NAZİK")
        kelimeler.add("PİLAV")
        kelimeler.add("TARİF")
        kelimeler.add("HAYIR")
        kelimeler.add("KESİR")
        kelimeler.add("KEFİR")
        kelimeler.add("KUPON")
        kelimeler.add("ARMUT")
        kelimeler.add("KAPAN")
        kelimeler.add("PAMUK")
        kelimeler.add("DÜNYA")
        kelimeler.add("ARIZA")
        kelimeler.add("KÜVET")
        kelimeler.add("NEFİS")
        kelimeler.add("TURAN")
        kelimeler.add("HURMA")
        kelimeler.add("KÜNYE")
        kelimeler.add("ŞİRİN")
        kelimeler.add("VERGİ")
        kelimeler.add("PENÇE")
        kelimeler.add("RENDE")
        kelimeler.add("DAMAK")
        kelimeler.add("ZEMİN")
        kelimeler.add("YORUM")
        kelimeler.add("RAKET")
        kelimeler.add("SEPET")
        kelimeler.add("ALKOL")
        kelimeler.add("ÇİZGİ")
        kelimeler.add("CİĞER")
        kelimeler.add("LİMİT")
        kelimeler.add("TÜREV")
        kelimeler.add("ÇORBA")
        kelimeler.add("ÇORAP")
        kelimeler.add("SERGİ")
        kelimeler.add("BATIK")
        kelimeler.add("ASABİ")
        kelimeler.add("SEMER")
        kelimeler.add("SORGU")
        kelimeler.add("DOĞRU")
        kelimeler.add("MİDYE")
        kelimeler.add("MİYOP")
        kelimeler.add("TABAN")
        kelimeler.add("POLEN")
        kelimeler.add("DENEY")
        kelimeler.add("EVRİM")
        kelimeler.add("FUHUŞ")
        kelimeler.add("SUBAY")
        kelimeler.add("SUNUM")
        kelimeler.add("OLGUN")
        kelimeler.add("ORTAM")
        kelimeler.add("SEHER")
        kelimeler.add("ALACA")
        kelimeler.add("KUMAŞ")
        kelimeler.add("HEDEF")
        kelimeler.add("ZALİM")
        kelimeler.add("MAYIS")
        kelimeler.add("EYLÜL")
        kelimeler.add("BİLYE")
        kelimeler.add("KARIN")
        kelimeler.add("KÜFÜR")
        kelimeler.add("KOBRA")
        kelimeler.add("KOALA")
        kelimeler.add("KUZEN")
        kelimeler.add("VEFAT")
        kelimeler.add("ÖDLEK")
        kelimeler.add("KARMA")
        kelimeler.add("TAHIL")
        kelimeler.add("ALBAY")
        kelimeler.add("DİYAR")
        kelimeler.add("İDARE")
        kelimeler.add("TEORİ")
        kelimeler.add("TEVZİ")
        kelimeler.add("GÜVEN")
        kelimeler.add("SINIR")
        kelimeler.add("MODEL")
        kelimeler.add("YOSUN")
        kelimeler.add("YEMİŞ")
        kelimeler.add("ERGİN")
        kelimeler.add("ÇİZME")
        kelimeler.add("KURYE")
        kelimeler.add("YARIŞ")
        kelimeler.add("TORNA")
        kelimeler.add("DÜZEY")
        kelimeler.add("MADEN")
        kelimeler.add("BARUT")
        kelimeler.add("BİÇİM")
        kelimeler.add("YASAK")
        kelimeler.add("TEKİL")
        kelimeler.add("YOĞUN")
        kelimeler.add("TANRI")
        kelimeler.add("PLAKA")
        kelimeler.add("ÖLÇEK")
        kelimeler.add("ERKEN")
        kelimeler.add("VENÜS")
        kelimeler.add("ÜCRET")
        kelimeler.add("HAZNE")
        kelimeler.add("ABİYE")
        kelimeler.add("HAVUÇ")
        kelimeler.add("HALİÇ")
        kelimeler.add("BAVUL")
        kelimeler.add("CAHİL")
        kelimeler.add("CAMİA")
        kelimeler.add("BADEM")
        kelimeler.add("APTAL")
        kelimeler.add("FACİA")
        kelimeler.add("EBEDİ")
        kelimeler.add("ILICA")
        kelimeler.add("HACİZ")
        kelimeler.add("İBLİS")
        kelimeler.add("NADİR")
        kelimeler.add("OBRUK")
        kelimeler.add("JETON")
        kelimeler.add("LADİN")
        kelimeler.add("MADDE")
        kelimeler.add("ÖDÜNÇ")
        kelimeler.add("ÖKSÜZ")
        kelimeler.add("ÖĞLEN")
        kelimeler.add("PABUÇ")
        kelimeler.add("SAPIK")
        kelimeler.add("ŞAHIS")
        kelimeler.add("UCUBE")
        kelimeler.add("ÜNVAN")
        kelimeler.add("VAHİM")
        kelimeler.add("VAHİY")
        kelimeler.add("YABAN")
        kelimeler.add("ZAFER")
        kelimeler.add("RADDE")
        kelimeler.add("REHİN")
        kelimeler.add("REJİM")
        kelimeler.add("TAKOZ")
        kelimeler.add("TENİS")
        kelimeler.add("TESİS")
        kelimeler.add("BOZUK")
        kelimeler.add("BRONZ")
        kelimeler.add("BOĞAZ")
        kelimeler.add("BİLET")
        kelimeler.add("BASİT")
        kelimeler.add("BATIL")
        kelimeler.add("BORDO")
        kelimeler.add("DEVİR")
        kelimeler.add("DÜĞÜM")
        kelimeler.add("DALAK")
        kelimeler.add("ÇENEK")
        kelimeler.add("ÇELLO")
        kelimeler.add("CİRİT")
        kelimeler.add("ÇEHRE")
        kelimeler.add("CASUS")
        kelimeler.add("CEPHE")
        kelimeler.add("CEBİR")
        kelimeler.add("CİDDİ")
        kelimeler.add("CAZİP")
        kelimeler.add("CİMRİ")
        kelimeler.add("CÜCÜK")
        kelimeler.add("CÜBBE")
        kelimeler.add("GÜLLE")
        kelimeler.add("GÜVEÇ")
        kelimeler.add("GÜNAH")
        kelimeler.add("GÖLET")
        kelimeler.add("HAFIZ")
        kelimeler.add("HADİS")
        kelimeler.add("HAKEM")
        kelimeler.add("HALAY")
        kelimeler.add("HAMLE")
        kelimeler.add("HARİÇ")
        kelimeler.add("HUZUR")
        kelimeler.add("ÖZGÜN")
        kelimeler.add("ÖNDER")
        kelimeler.add("ÖNLEM")
        kelimeler.add("ÖRGÜT")
        kelimeler.add("ÖZDEŞ")
        kelimeler.add("ÖZENÇ")
        kelimeler.add("ÖZNEL")
        kelimeler.add("PANİK")
        kelimeler.add("PAPAZ")
        kelimeler.add("PASİF")
        kelimeler.add("PELÜŞ")
        kelimeler.add("PLATO")
        kelimeler.add("PİŞİK")
        kelimeler.add("PENYE")
        kelimeler.add("ZÜPPE")
        kelimeler.add("ZİGOT")
        kelimeler.add("ZIMBA")
        kelimeler.add("ZİGON")
        kelimeler.add("AKTİF")
        kelimeler.add("VOKAL")
        kelimeler.add("VAROŞ")
        kelimeler.add("VEZNE")
        kelimeler.add("VÜCUT")
        kelimeler.add("VASAT")
        kelimeler.add("VAŞAK")
        kelimeler.add("VİSKİ")
        kelimeler.add("VEREM")
        kelimeler.add("SAYAÇ")
        kelimeler.add("SAUNA")
        kelimeler.add("BULUŞ")
        kelimeler.add("VALİZ")
        kelimeler.add("ÇAPAK")
        kelimeler.add("BAHİS")
        kelimeler.add("KEPEK")
        kelimeler.add("MİZAH")
        kelimeler.add("NAMUL")
        kelimeler.add("MATEM")
        kelimeler.add("REKOR")
        kelimeler.add("KAVAL")
        kelimeler.add("DÖKÜM")
        kelimeler.add("SERAP")
        kelimeler.add("SUNTA")
        kelimeler.add("ZARİF")
        kelimeler.add("TÖREN")
        kelimeler.add("FİTİL")
        kelimeler.add("FESAT")
        kelimeler.add("DEKOR")
        kelimeler.add("BORSA")
        kelimeler.add("SABİT")
        kelimeler.add("HIZIR")
        kelimeler.add("KÜLÇE")
        kelimeler.add("FIRÇA")
        kelimeler.add("ARTÇI")
        kelimeler.add("KISIR")
        kelimeler.add("CİSİM")
        kelimeler.add("ISLIK")
        kelimeler.add("DÜMEN")
        kelimeler.add("DOLGU")
        kelimeler.add("CESET")
        kelimeler.add("CILIZ")
        kelimeler.add("ANTRE")
        kelimeler.add("CİHAZ")
        kelimeler.add("CÜSSE")
        kelimeler.add("BAGAJ")
        kelimeler.add("BRANŞ")
        kelimeler.add("DELİL")
        kelimeler.add("FURYA")
        kelimeler.add("GÜĞÜM")
        kelimeler.add("HACİM")
        kelimeler.add("ELYAF")
        kelimeler.add("GURME")
        kelimeler.add("KRAMP")
        kelimeler.add("KUBBE")
        kelimeler.add("KİREÇ")
        kelimeler.add("KLİMA")
        kelimeler.add("KLİŞE")
        kelimeler.add("GEOİT")
        kelimeler.add("GENOM")
        kelimeler.add("KULİS")
        kelimeler.add("YAVER")
        kelimeler.add("YAYLA")
        kelimeler.add("MİSİL")
        kelimeler.add("MISRA")
        kelimeler.add("MEZUN")
        kelimeler.add("MİNÖR")
        kelimeler.add("MAJÖR")
        kelimeler.add("KILIF")
        kelimeler.add("İBRET")
        kelimeler.add("İFLAS")

        //Toplam 1060 kelime
    }

    //Ayıp kelimelerin kaydı (Bu kelimeleri filtrele)
    private fun ayipKelimeListesiKayit() {
        //Github'a ayıp olmasın diye kaldırıldı ;)
        //Fakat kendi ayıp kelimelerini buraya ArrayList  olarak ekleyebilirsiniz. :D
    }

    // Rastgele kelime seç
    fun rastgeleKelimeSec(): String? {
        var secilenKelime: String? = null
        var cursor: Cursor? = null

        try
        {   //Rastgele bir kelime seçimi yapılır. Ancak bu veri tablodadır ve ulaşmak için konumuna gitmeliyiz.
            cursor = database.rawQuery("SELECT kelime FROM kelimeler ORDER BY RANDOM() LIMIT 1" , null)

            //Eğer birden fazla satır seçilmişse ya da satır yoksa ilk satıra git
            if (cursor.moveToFirst())
            {
                //Tablodaki veriyi çekmek için kelime isimli sütuna gideriz.
                val kelimeColumnIndex = cursor.getColumnIndex("kelime")
                //Daha sonra getString ile daha önceden seçilmiş kelimeyi çekeriz.
                secilenKelime = cursor.getString(kelimeColumnIndex)
            }

        } catch(e: SQLException) {
            e.printStackTrace()
        } finally {
            cursor?.close()
        }
        return secilenKelime
    }

    // Veri tabanı kontrolü
    fun veriTabaniVarMi(): Boolean {
        return getInt() == 1
    }

    // Shared Preferencec kayıt
    private fun saveInt() {
        //Eğer veri tabanı daha önceden oluşturulmuşsa 1 değeri
        //kaydedilir. Bu syede veri tabanının varşığı kontrol edilir.
        kontrol.edit().putInt(kontrolAnahtari , 1).apply()
    }

    // Shared Preferencec veri oku
    private fun getInt(): Int{
        //Eğer veri tabanı kaydı yoksa 0 derğeri kaydedilir.
        //Bu sayede veri tabannının olmadığı anlaşılabilir.
        return kontrol.getInt(kontrolAnahtari,0)
    }

    // Veri tabanın verilerini yazdir
    private fun veriTabaniYazdir() {
        try
        {
            val cursor = database.rawQuery("SELECT * FROM Kelimeler", null)
            val kelimeColumnIndex = cursor.getColumnIndex("kelime")
            cursor.moveToFirst()

            while(cursor.moveToNext()) {
                println(cursor.getString(kelimeColumnIndex))
            }
            cursor.close()

        }catch(e: SQLException) {
            e.printStackTrace()
        }finally {
            saveInt()
        }
    }

}