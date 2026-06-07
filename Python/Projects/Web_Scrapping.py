import os
import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin

def download_images(url, folder_path):
    # Create folder if it doesn't exist
    if not os.path.exists(folder_path):
        os.makedirs(folder_path)

    # Fetch the HTML content
    response = requests.get(url)
    soup = BeautifulSoup(response.text, 'html.parser')

    # Find all image tags
    img_tags = soup.find_all('img')

    # Download each image
    for img in img_tags:
        img_url = img.get('src')
        if not img_url:
            continue

        # Handle relative URLs
        img_url = urljoin(url, img_url)

        # Get the image name
        img_name = os.path.basename(img_url)

        # Download the image
        img_response = requests.get(img_url)
        if img_response.status_code == 200:
            with open(os.path.join(folder_path, img_name), 'wb') as f:
                f.write(img_response.content)
            print(f"Downloaded {img_name}")
        else:
            print(f"Failed to download {img_name}")

# Example usage
download_images('https://smu.onlinemanipal.com/', 'downloaded_images')