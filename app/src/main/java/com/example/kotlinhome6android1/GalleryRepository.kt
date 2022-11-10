package com.example.kotlinhome6android1

class GalleryRepository {
    private val galleryList = mutableListOf<GalleryModel>()

    fun getPhotos(): List<GalleryModel> {
        galleryList.add(
            GalleryModel(
                1,
                "https://w7.pngwing.com/pngs/640/492/png-transparent-jerry-mouse-tom-cat-tom-and-jerry-cartoon-drawing-tom-and-jerry-comics-mammal-heroes.png"
            )
        )
        galleryList.add(
            GalleryModel(
                2,
                "https://images.wallpaperscraft.ru/image/single/gorod_futurizm_scifi_131831_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                3,
                "https://images.wallpaperscraft.ru/image/single/kniga_shar_magiya_koldovstvo_46753_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                4,
                "https://images.wallpaperscraft.ru/image/single/korabli_more_svet_dozhd_69192_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                5,
                "https://images.wallpaperscraft.ru/image/single/planeta_galaktika_vselennaia_121293_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                6,
                "https://images.wallpaperscraft.ru/image/single/kosmos_planety_vzlet_vzryv_96455_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                7,
                "https://images.wallpaperscraft.ru/image/single/kosmonavt_skafandr_raznotsvetnyj_123724_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                8,
                "https://images.wallpaperscraft.ru/image/single/volk_luna_noch_150508_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                9,
                "https://images.wallpaperscraft.ru/image/single/soldat_shlem_art_123765_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                10,
                "https://images.wallpaperscraft.ru/image/single/chip_shema_protsessor_140251_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                11,
                "https://images.wallpaperscraft.ru/image/single/matritsa_kod_tsifry_147523_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                12,
                "https://images.wallpaperscraft.ru/image/single/kod_tekst_raznotsvetnyj_140555_300x168.jpg"
            )
        )
        galleryList.add(
            GalleryModel(
                13,
                "https://images.wallpaperscraft.ru/image/single/fotoapparat_obektiv_remeshok_145518_300x168.jpg"
            )
        )

        return galleryList
    }
}